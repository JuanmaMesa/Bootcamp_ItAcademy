package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.exceptions;

public class PlayerAlreadyExistException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public PlayerAlreadyExistException(String msg){
        super(msg);
    }
}
