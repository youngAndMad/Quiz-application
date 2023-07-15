package danekerscode.quizbackend.repository;

import danekerscode.quizbackend.model.Quiz;
import danekerscode.quizbackend.utils.Level;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {
    List<Quiz> findAllByLevel(Level level);
}