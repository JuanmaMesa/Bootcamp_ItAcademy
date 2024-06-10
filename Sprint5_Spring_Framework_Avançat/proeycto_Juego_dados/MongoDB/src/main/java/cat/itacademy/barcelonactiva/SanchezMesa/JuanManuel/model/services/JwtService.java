package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    String extractUserName(String token);

    String generateToken(UserDetails userDetails);

    boolean isTokenValid(String token, UserDetails userDetails);


}
