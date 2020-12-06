package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarTextoUI {

    public static final Target VALIDAR_TEXTO = Target.the("Validamos texto para comprobar si es correcto").located(By.id("time"));
}
