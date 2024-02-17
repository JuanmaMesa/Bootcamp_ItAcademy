package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.request.SignInRequest;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.request.SignUpRequest;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.security.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signUp(SignUpRequest request);

    JwtAuthenticationResponse signIn (SignInRequest request);

}
