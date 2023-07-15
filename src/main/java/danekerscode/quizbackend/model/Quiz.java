package danekerscode.quizbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import danekerscode.quizbackend.utils.Level;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "quiz")
    private List<Question> questions;

    @Enumerated(EnumType.STRING)
    private Level level;

    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "users_passed_quizzes",
            joinColumns = @JoinColumn(name = "quiz_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id")
    )
    private List<User> users;
}
