package danekerscode.quizbackend.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;
import java.util.Date;


@Component
@RequiredArgsConstructor
@Slf4j @Getter
public class JwtUtil {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.access-token-expiration}")
    private Integer accessTokenExpiration;


    public String generateToken(String email) {
        Date expirationDate = Date.from(ZonedDateTime.now()
                .plusSeconds(accessTokenExpiration).toInstant());

        return JWT
                .create()
                .withSubject("credentials")
                .withClaim("email", email)
                .withIssuedAt(new Date())
                .withIssuer("quiz-app")
                .withExpiresAt(expirationDate)
                .sign(Algorithm.HMAC256(secret));
    }

    public String validateTokenAndRetrieveClaim(String token){
        JWTVerifier verifier = JWT
                .require(Algorithm.HMAC256(secret))
                .withSubject("credentials")
                .withIssuer("quiz-app")
                .build();
        try {
            DecodedJWT jwt = verifier.verify(token);
            System.out.println(jwt.getClaims());
            return jwt.getClaim("email").asString();
        } catch (JWTVerificationException e) {
            throw e;
        }
    }

}