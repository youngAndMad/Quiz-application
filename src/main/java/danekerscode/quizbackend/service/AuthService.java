package danekerscode.quizbackend.service;

import danekerscode.quizbackend.jwt.JwtUtil;
import danekerscode.quizbackend.model.User;
import danekerscode.quizbackend.payload.AuthRequest;
import danekerscode.quizbackend.payload.TokenResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final JwtUtil jwtUtil;
    private final AuthenticationManager authenticationManager;

    public TokenResponse generateToken(User user) {
        return new TokenResponse(jwtUtil.generateToken(user.getEmail()), jwtUtil.getAccessTokenExpiration(), user);
    }

    public TokenResponse authenticate(AuthRequest authRequest) {
        System.out.println(authRequest);
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                authRequest.email(),
                authRequest.password()
        );

        System.out.println(authenticationToken);
        var user = (User) authenticationManager.authenticate(authenticationToken).getPrincipal();
        System.out.println(user);
        return this.generateToken(user);
    }
}
