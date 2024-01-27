package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BankBranch;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.repository.BankBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S05T01N01SanchezMesaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(S05T01N01SanchezMesaApplication.class, args);
	}

	@Autowired
	private BankBranchRepository repository;
	@Override
	public void run(String... args) throws Exception {
		/*BankBranch sucursal1 = new BankBranch("Bankiner", "Japon");
		repository.save(sucursal1);

		BankBranch sucursal2 = new BankBranch("ING", "China");
		repository.save(sucursal2);

		BankBranch sucursal3 = new BankBranch("Abanca", "Galicia");
		repository.save(sucursal3);*/
	}
}
