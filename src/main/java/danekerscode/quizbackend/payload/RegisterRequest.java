package danekerscode.quizbackend.payload;

public record RegisterRequest(
        String name,
        String surname,
        String email,
        String password
) {
}
