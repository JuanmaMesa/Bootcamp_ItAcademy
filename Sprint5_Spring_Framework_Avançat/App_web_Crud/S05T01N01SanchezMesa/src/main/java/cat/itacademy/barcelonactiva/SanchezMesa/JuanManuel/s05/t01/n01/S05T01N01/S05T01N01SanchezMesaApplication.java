package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.repository.BankBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S05T01N01SanchezMesaApplication  {

	public static void main(String[] args) {
		SpringApplication.run(S05T01N01SanchezMesaApplication.class, args);
	}

	@Autowired
	private BankBranchRepository repository;
}
