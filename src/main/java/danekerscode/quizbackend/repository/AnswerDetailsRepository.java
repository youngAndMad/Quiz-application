package danekerscode.quizbackend.repository;

import danekerscode.quizbackend.model.AnswerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerDetailsRepository extends JpaRepository<AnswerDetails,Integer> {
}
