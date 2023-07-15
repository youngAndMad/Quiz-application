package danekerscode.quizbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    private String question;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "quiz_id", referencedColumnName = "id")
    private Quiz quiz;
}