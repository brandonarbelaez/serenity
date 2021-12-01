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
import starter.questions.sophos.OfertasDisponibles;
import starter.tasks.sophos.DoSophos;
import starter.ui.dashboard.DashboardPage;
import starter.ui.sophos.Constants;

import java.util.ArrayList;
import java.util.List;

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
        if(this.name==""){
            this.name="Pepito";
        }

    }

    @When("obtiene las ofertas laborales")
    public void obtener_ofertas() {
        theActorCalled(name).attemptsTo(
                NavigateTo.theSophosSolutions(),
                DoSophos.withCredentials()
        );

    }
    @Then("imprime lo que obtuvo")
    public void imprimir_resultado() {
        List<String> lista = new ArrayList<>();
        for (int i=1;i<=5;i++) {
            String contenido = OfertasDisponibles.creditAvailable(i).answeredBy(theActorInTheSpotlight());
            lista.add(contenido);
        }
        System.out.println(lista);


    }
}
