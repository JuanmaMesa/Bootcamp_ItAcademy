package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.request.SignInRequest;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.request.SignUpRequest;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signUp(SignUpRequest request);

    JwtAuthenticationResponse signIn (SignInRequest request);

}
