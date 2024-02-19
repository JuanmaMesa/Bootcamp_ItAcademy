package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.controllers;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.request.SignInRequest;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.request.SignUpRequest;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.response.JwtAuthenticationResponse;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.AuthenticationService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @Operation(summary = "SignUp new Player")
    @PostMapping("/signup")
    public ResponseEntity<JwtAuthenticationResponse>signUp(@RequestBody SignUpRequest request){
        return ResponseEntity.ok(authenticationService.signUp(request));
    }

    @Operation(summary = "SignIn User")
    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SignInRequest request) {
        return ResponseEntity.ok(authenticationService.signIn(request));
    }




}
