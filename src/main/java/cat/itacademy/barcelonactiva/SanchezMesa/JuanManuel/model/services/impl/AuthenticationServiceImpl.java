package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.request.SignInRequest;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.request.SignUpRequest;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.User;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.enums.Role;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.exceptions.PlayerAlreadyExistException;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.response.JwtAuthenticationResponse;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.exceptions.PlayerNotFoundException;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.UserRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.AuthenticationService;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl  implements AuthenticationService {

    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;


    @Override
    public JwtAuthenticationResponse signUp(SignUpRequest request) {
        //try {
            var user = User.builder().
                    firstName(request.getFirstName())
                    .lastName(request.getLastName())
                    .email(request.getEmail())
                    .password(passwordEncoder.encode(request.getPassword()))
                    .role(Role.PLAYER)
                    .build();
            userRepository.save(user);

            var jwt = jwtService.generateToken(user);
            return JwtAuthenticationResponse.builder().
                    token(jwt)
                    .message("User created succesfully")
                    .build();
        //} catch (Exception e) {
           // throw new PlayerAlreadyExistException("User already exist.");
        //}

    }
    @Override
    public JwtAuthenticationResponse signIn(SignInRequest request) {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getEmail(),
                            request.getPassword()));

            var user = userRepository.findByEmail(request.getEmail())
                    .orElseThrow(() -> new PlayerNotFoundException("Player Not found with email: " + request.getEmail()));

            var jwt = jwtService.generateToken(user);
            return JwtAuthenticationResponse
                    .builder()
                    .token(jwt)
                    .message("Authentication successful")
                    .build();


        } catch (Exception e){
            throw new BadCredentialsException("password not valid.");
    }
}
}




