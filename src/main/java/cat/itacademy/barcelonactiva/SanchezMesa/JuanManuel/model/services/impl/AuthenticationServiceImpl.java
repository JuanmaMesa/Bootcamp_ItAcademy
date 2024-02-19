package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.request.SignInRequest;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.request.SignUpRequest;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.enums.Role;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.PlayerRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.response.JwtAuthenticationResponse;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.AuthenticationService;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.JwtService;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl  implements AuthenticationService {

    private final PlayerRepository playerRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;
    private final PlayerService playerService;


    @Override
    public JwtAuthenticationResponse signUp(SignUpRequest request) {
        PlayerEntity playerEntity = PlayerEntity.builder()
                .name(request.getName())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.PLAYER)
                .build();
        playerRepository.save(playerEntity);

        // necesitamos convertir playerEntity a UserDetails
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                playerEntity.getName(),
                playerEntity.getPassword(),
                AuthorityUtils.createAuthorityList("ROLE_" + playerEntity.getRole().name())
        );


                String jwtToken = jwtService.generateToken(userDetails);
        return JwtAuthenticationResponse.builder()
                .token(jwtToken)
                .message("User created successfully")
                .build();
    }


    @Override
    public JwtAuthenticationResponse signIn(SignInRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getName(),
                        request.getPassword()
                )
        );
        UserDetails userDetails = playerService.userDetailsService().loadUserByUsername(request.getName());
        String jwtToken = jwtService.generateToken(userDetails);
        return JwtAuthenticationResponse.builder()
                .token(jwtToken)
                .message("Authentication successful")
                .build();
    }





}


