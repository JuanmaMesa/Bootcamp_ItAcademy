package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;

@ControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(BranchNotFoundException.class)
    public String handleBranchNotFoundException(BranchNotFoundException exception, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("ErrorMessage", exception.getMessage());
        return "redirect:/api/v1/branches";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorMessage> illegalArgumentException(IllegalArgumentException ex, WebRequest request) {
        ErrorMessage message = new ErrorMessage(
                HttpStatus.CONFLICT.value(),
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<ErrorMessage>(message, HttpStatus.CONFLICT);
    }


}
