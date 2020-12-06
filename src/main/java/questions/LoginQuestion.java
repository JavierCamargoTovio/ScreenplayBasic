package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.ValidarTextoUI;

public class LoginQuestion implements Question {
    private String validarTexto;

    public LoginQuestion(String validarTexto){
        this.validarTexto = validarTexto;
    }


    @Override
    public Object answeredBy(Actor actor) {
        String textoValidar = Text.of(ValidarTextoUI.VALIDAR_TEXTO).viewedBy(actor).asString();

        if(validarTexto.equals(textoValidar.toString())){
          return true;
        }else{
            return false;
        }

    }

    public static LoginQuestion validarTextoQuestion(String validarTexto){
        return new LoginQuestion(validarTexto);
    }

}
