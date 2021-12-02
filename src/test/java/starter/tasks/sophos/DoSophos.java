package starter.tasks.sophos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElements;
import starter.questions.sophos.OfertasDisponibles;
import starter.ui.sophos.Constants;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoSophos implements Task {
    private String div;
    private String trabajeConNosotros;

    public DoSophos() {

    }
    public static Performable withCredentials() {
        return instrumented(DoSophos.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Hit.the(Keys.ESCAPE).into(Constants.DIV),
                Click.on(Constants.TRABAJE_CON_NOSOTROS)
        );

    }
}
