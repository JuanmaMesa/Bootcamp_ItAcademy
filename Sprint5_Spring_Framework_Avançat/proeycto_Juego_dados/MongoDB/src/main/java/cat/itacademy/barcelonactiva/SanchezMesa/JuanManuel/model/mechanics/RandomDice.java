package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.mechanics;
import java.util.Random;
public class RandomDice {
        private static final Random random = new Random();
        private final static int MIN = 1;
        private final static int MAX = 6;

        public static int newRandomDice(){
            return random.nextInt(MAX - MIN + 1)+ MIN;

        }

}
