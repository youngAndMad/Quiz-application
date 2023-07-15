package danekerscode.quizbackend.model;
import lombok.*;
import org.hibernate.service.spi.InjectService;

import javax.persistence.*;
import java.util.List;
//апидрочер
@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class AnswerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer answerId;
    private Integer questionId;
    private String questionText;
    private String userAnswerText;
    private String correctAnswerText;
    private Boolean correct;
}
