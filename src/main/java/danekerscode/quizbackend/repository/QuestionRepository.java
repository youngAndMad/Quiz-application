package danekerscode.quizbackend.repository;

import danekerscode.quizbackend.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}