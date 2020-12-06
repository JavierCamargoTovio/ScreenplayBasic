package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI  extends PageObject {
    public static final Target INPUT_USER_NAME = Target.the("Ingrese el usuario").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Ingrese la contraseña").located(By.id("password"));
    public static  final Target BTN_SIGN_IN = Target.the("boton ingresar").located(By.id("log-in"));
}
