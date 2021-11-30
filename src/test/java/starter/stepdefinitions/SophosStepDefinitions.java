package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.questions.dashboard.OverviewData;
import starter.tasks.sophos.DoSophos;
import starter.ui.dashboard.DashboardPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class SophosStepDefinitions {
    String name;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) va a la url de sophos")
    public void ir_url_sophos(String name) {
        this.name = name;

    }

    @When("obtiene las ofertas laborales")
    public void obtener_ofertas() {
        theActorCalled(name).attemptsTo(
                NavigateTo.theSophosSolutions(),
                DoSophos.withCredentials()
        );
        System.out.println("Algo");
    }
    @Then("imprime lo que obtuvo")
    public void imprimir_resultado() {
        System.out.println("Fin");
    }
}
