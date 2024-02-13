package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.exceptions;

public class PlayerAlredyExistException  extends  RuntimeException{
    private static final long serialVersionUID = 1L;

    public PlayerAlredyExistException(String msg){
        super(msg);
    }
}
