package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.LoginQuestion;
import tasks.LoginTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStep {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El cliente abre la pagina web$")
    public void el_cliente_abre_la_pagina_web()  {
        theActorCalled("Cliente").wasAbleTo(Open.url("https://demo.applitools.com/"));

    }

    @When("^El cliente  (.+) y  (.+)$")
    public void el_cliente_y(String usuario, String contrasenna)  {
    theActorInTheSpotlight().attemptsTo(LoginTask.inicioSesion(usuario,contrasenna));
    }

    @Then("^Ver la cuenta (.+)$")
    public void ver_la_cuenta(String validartexto)  {
     theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginQuestion.validarTextoQuestion(validartexto)));
    }
}
