package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginUI;

public class LoginTask implements Task {
    private  String usuario;
    private  String contrasenna;

    public LoginTask(String usuario, String contrasenna) {
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginUI.INPUT_USER_NAME));
     actor.attemptsTo(Enter.theValue(usuario).into(LoginUI.INPUT_USER_NAME));
    actor.attemptsTo(Enter.theValue(contrasenna).into(LoginUI.INPUT_PASSWORD));
     actor.attemptsTo(Click.on(LoginUI.BTN_SIGN_IN));
    }
    public static LoginTask inicioSesion(String usuario, String contrasenna){
        return Tasks.instrumented(LoginTask.class, usuario, contrasenna);
    }

}
