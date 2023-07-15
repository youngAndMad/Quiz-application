package danekerscode.quizbackend.service;

import danekerscode.quizbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       var user = userRepository.findByEmail(email);
       if (user.isEmpty()){
           throw new UsernameNotFoundException("invalid credentials");
       }
       return user.get();
    }
}
