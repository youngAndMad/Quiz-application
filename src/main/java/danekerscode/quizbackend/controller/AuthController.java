package danekerscode.quizbackend.controller;

import danekerscode.quizbackend.payload.AuthRequest;
import danekerscode.quizbackend.payload.RegisterRequest;
import danekerscode.quizbackend.payload.TokenResponse;
import danekerscode.quizbackend.service.UserService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("auth")
public class AuthController {

    private final UserService userService;

    @PostMapping("sign-up")
    ResponseEntity<?> register(
            @RequestBody RegisterRequest request
    ) {
        return new ResponseEntity<>(userService.save(request), HttpStatus.CREATED);
    }
    @ApiResponses(value = {
            @ApiResponse(content = @Content(mediaType = "application/json" , schema = @Schema(implementation = TokenResponse.class)))
    })
    @PostMapping("sign-in")
    ResponseEntity<?> authenticate(
            @RequestBody AuthRequest authRequest
    ) {
        System.out.println("hello world from sign in endpoint");
        System.out.println(authRequest);
        var token = userService.authenticate(authRequest);
        System.out.println(token); // запусти и логин жасашы

        return new ResponseEntity<>(token , HttpStatus.ACCEPTED);
    }


}
