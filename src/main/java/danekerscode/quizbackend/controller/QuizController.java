package danekerscode.quizbackend.controller;

import danekerscode.quizbackend.payload.QuizAnswersRequest;
import danekerscode.quizbackend.model.Review;
import danekerscode.quizbackend.service.QuizService;
import danekerscode.quizbackend.utils.Level;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import danekerscode.quizbackend.model.Quiz;

@RequiredArgsConstructor
@RestController
@RequestMapping("quiz")
public class QuizController {

    private final QuizService quizService;

    @GetMapping("all")
    ResponseEntity<?> getAll() {
        return ResponseEntity.ok(quizService.getAll());
    }

    @GetMapping()
    @ApiResponses(
            value = @ApiResponse(content = @Content(mediaType = "application/json" ,
                    array = @ArraySchema(schema = @Schema(implementation = Quiz.class))))
    )
    ResponseEntity<?> getAllByLevel(
            @RequestParam("level") Level level
    ) {
        return ResponseEntity.ok(quizService.getByLevel(level));
    }

    @GetMapping("{id}")
    ResponseEntity<?> getById(
            @PathVariable Integer id
    ) {
        return ResponseEntity.ok(quizService.getById(id));
    }

    @DeleteMapping("{id}")
    void deleteQuiz(
            @PathVariable Integer id
    ) {
        quizService.deleteQuiz(id);
    }

    @DeleteMapping("question/{id}")
    void deleteQuestion(
            @PathVariable Integer id
    ) {
        quizService.deleteQuestion(id);
    }

    @DeleteMapping("answer/{id}")
    void deleteAnswer(
            @PathVariable Integer id
    ) {
        quizService.deleteAnswer(id);
    }

    @ApiResponses(value = {
            @ApiResponse(content = @Content(mediaType = "application/json" , schema = @Schema(implementation = Review.class)))
    })
    @PutMapping("review")
    ResponseEntity<?> getReview(@RequestBody QuizAnswersRequest request) {
        return ResponseEntity.ok(quizService.getReview(request));
    }

    @GetMapping("review/{id}")
    ResponseEntity<?> get(@PathVariable Integer id){
        return ResponseEntity.ok(quizService.getReviewById(id));
    }


}
