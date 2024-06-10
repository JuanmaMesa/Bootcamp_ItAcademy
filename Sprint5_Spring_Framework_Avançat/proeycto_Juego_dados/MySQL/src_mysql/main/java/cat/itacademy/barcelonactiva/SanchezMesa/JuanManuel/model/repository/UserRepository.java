package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
=======
>>>>>>> repo5/master
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
<<<<<<< HEAD
public interface UserRepository  extends MongoRepository<User, String> {
=======
public interface UserRepository  extends JpaRepository<User, Integer> {
>>>>>>> repo5/master

    Optional<User> findByEmail(String email);
}
