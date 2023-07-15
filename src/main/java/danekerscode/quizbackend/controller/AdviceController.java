package danekerscode.quizbackend.controller;

import danekerscode.quizbackend.payload.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class AdviceController {
    @ExceptionHandler(UsernameNotFoundException.class)
    ResponseEntity<?> handle(UsernameNotFoundException e){
        return new ResponseEntity<>(new ErrorResponse(e.getMessage()) , HttpStatus.UNAUTHORIZED);
    }
}
