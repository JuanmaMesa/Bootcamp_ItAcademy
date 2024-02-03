package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@ControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(BranchNotFoundException.class)
    public String handleBranchNotFoundException(BranchNotFoundException exception, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("ErrorMessage", exception.getMessage());
        return "redirect:/api/v1/branches";
    }


}
