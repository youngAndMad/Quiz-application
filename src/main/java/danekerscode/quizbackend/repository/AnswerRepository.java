package danekerscode.quizbackend.repository;

import danekerscode.quizbackend.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}