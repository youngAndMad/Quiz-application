package danekerscode.quizbackend.service;

import danekerscode.quizbackend.model.User;
import danekerscode.quizbackend.payload.AuthRequest;
import danekerscode.quizbackend.payload.RegisterRequest;
import danekerscode.quizbackend.payload.TokenResponse;
import danekerscode.quizbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthService authService;

    public TokenResponse save(RegisterRequest request) {
        User user = User.builder()
                .password(passwordEncoder.encode(request.password()))
                .name(request.name())
                .email(request.email())
                .surname(request.surname())
                .build();

        userRepository.save(user);
        return authService.generateToken(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    public User update(Integer id, String name, String surname) {
        var user = userRepository.findById(id).orElseThrow();
        user.setName(name);
        user.setSurname(surname);
        return userRepository.save(user);
    }

    public User getById(Integer id){
        return userRepository.findById(id).orElseThrow();
    }

    public TokenResponse authenticate(AuthRequest authRequest) {
        return authService.authenticate(authRequest);
    }

}
