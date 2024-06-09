package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n01.S04T02N01.model.exceptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.util.BindErrorUtils;


@ControllerAdvice
public class ExceptionHandlerAdvice {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String>handleProducuctNotFound(ProductNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationException(MethodArgumentNotValidException ex){
        return ResponseEntity.badRequest().body("Input not valid\n" + BindErrorUtils.resolveAndJoin(ex.getFieldErrors()));
    }


}
