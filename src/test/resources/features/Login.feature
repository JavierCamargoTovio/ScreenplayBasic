Feature: Login

  @ScenarioExit
  Scenario Outline: Loguearse a applitol
    Given El cliente abre la pagina web
    When El cliente  <usuario> y  <contrasenna>
    Then Ver la cuenta <validartexto>
    Examples:
    |usuario|contrasenna|validartexto|
    |test01|123test*|Your nearest branch closes in: 30m 5s|