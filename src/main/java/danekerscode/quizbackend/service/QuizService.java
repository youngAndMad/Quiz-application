package danekerscode.quizbackend.service;

import danekerscode.quizbackend.model.Answer;
import danekerscode.quizbackend.model.Quiz;
import danekerscode.quizbackend.model.AnswerDetails;
import danekerscode.quizbackend.payload.QuizAnswersRequest;
import danekerscode.quizbackend.model.Review;
import danekerscode.quizbackend.repository.*;
import danekerscode.quizbackend.utils.Level;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class QuizService {
    private final QuizRepository quizRepository;
    private final AnswerRepository answerRepository;
    private final AnswerDetailsRepository answerDetailsRepository;
    private final QuestionRepository questionRepository;
    private final ReviewRepository reviewRepository;

    public List<Quiz> getAll() {
        return quizRepository.findAll();
    }

    public List<Quiz> getByLevel(Level level) {
        return quizRepository.findAllByLevel(level);
    }

    public void deleteQuiz(Integer id) {
        quizRepository.deleteById(id);
    }

    public void deleteQuestion(Integer id) {
        questionRepository.deleteById(id);
    }

    public void deleteAnswer(Integer id) {
        answerRepository.deleteById(id);
    }

    public Quiz getById(Integer id) {
        return quizRepository.findById(id).orElseThrow();
    }

    public Integer getReview(QuizAnswersRequest answersRequest) {
        var quiz = quizRepository.findById(answersRequest.quizId()).orElseThrow();
        List<AnswerDetails> details = new ArrayList<>();
        answersRequest.answers().entrySet()
                .forEach(e -> {
                    var d = toAnswerDetails(e);
                    answerDetailsRepository.save(d);
                    details.add(d);
                    });
        var totalPoints = getTotalPoints(details);
        Review review = Review.builder()
                .quizId(answersRequest.quizId())
                .userId(answersRequest.userId())
                .details(details)
                .totalPoints(totalPoints)
                .totalPercent(((float) totalPoints / quiz.getQuestions().size()) * 100)
                .build();

        int id = reviewRepository.save(review).getId();
        System.out.println("id "+ id);//котлиннан запрос жіберші запускать етіп
        return id;
    }

    public Review getReviewById(Integer id){
        return reviewRepository.findById(id).orElseThrow();
    }

    private AnswerDetails toAnswerDetails(Map.Entry<String,Integer> e){
        final Integer value = e.getValue();
        final Integer key = toInt(e.getKey());
        return AnswerDetails
                .builder()
                .answerId(value)
                .questionId(key)
                .userAnswerText(answerText(value))
                .questionText(findQuestionText(key))
                .correctAnswerText(correctAnswerText(key))
                .correct(isCorrectAnswer(key , value))
                .build();
    }

   private String answerText(Integer id){
        return answerRepository.findById(id).orElseThrow().getAnswer();
   }

   private String correctAnswerText(Integer id){
        return questionRepository
                .findById(id)
                .orElseThrow()
                .getAnswers()
                .stream()
                .filter((Answer::getCorrect))
                .findFirst()
                .orElseThrow()
                .getAnswer();
   }

    private int toInt(String s) {
        return Integer.parseInt(s);
    }

    private boolean isCorrectAnswer(Integer questionId, Integer answerId) {
        return Objects.equals(this.correctAnswerId(questionId), answerId);
    }

    private Integer getTotalPoints(List<AnswerDetails> details) {
        return (int) (details.stream().filter(AnswerDetails::getCorrect).count());
    }

    private Integer correctAnswerId(Integer questionId) {
        return questionRepository
                .findById(questionId)
                .orElseThrow()
                .getAnswers()
                .stream()
                .filter(Answer::getCorrect)
                .findFirst()
                .orElseThrow()
                .getId();
    }

    private String findQuestionText(Integer id){
        return questionRepository.findById(id)
                .orElseThrow().getQuestion();
    }

}
