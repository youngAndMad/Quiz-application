package danekerscode.quizbackend.payload;

public record AuthRequest(
        String email,
        String password
) {
}
