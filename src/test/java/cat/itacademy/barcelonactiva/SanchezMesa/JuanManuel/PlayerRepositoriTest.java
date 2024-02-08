package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.Player;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class PlayerRepositoriTest {
    @Autowired
    private PlayerRepository repository;

    @Test
    public void testCreatePlayer(){
        Player playerAdd = repository.save(new Player(5,"john",5,10));
        

    }

}
