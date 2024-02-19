package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dao.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignInRequest {
    private String name;
    private String password;

}
