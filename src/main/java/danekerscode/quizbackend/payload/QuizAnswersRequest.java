package danekerscode.quizbackend.payload;

import java.util.Map;

public record QuizAnswersRequest(
        Integer quizId,
        Integer userId,
        Map<String,Integer> answers // question id & answer id
) {
}
