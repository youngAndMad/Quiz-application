package danekerscode.quizbackend.repository;

import danekerscode.quizbackend.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Integer> {
}
