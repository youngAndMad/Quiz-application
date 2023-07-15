package danekerscode.quizbackend.payload;

import danekerscode.quizbackend.model.User;

public record TokenResponse (
        String token,
        Integer expired,
        User user
){
}
