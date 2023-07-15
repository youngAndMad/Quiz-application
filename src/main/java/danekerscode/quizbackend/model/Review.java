package danekerscode.quizbackend.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

//апидрочеер!!!!!!
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quizId;
    private Integer userId;
    @OneToMany
    private List<AnswerDetails> details;
    private Integer totalPoints;
    private Float totalPercent;
}