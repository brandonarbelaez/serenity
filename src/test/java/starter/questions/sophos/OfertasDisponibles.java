package starter.questions.sophos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.ui.dashboard.FinancialOverview;
import starter.ui.sophos.Constants;

import java.util.ArrayList;
import java.util.List;

public class OfertasDisponibles {

    public static Question<String> creditAvailable(Integer i) {
        List<Object> lista = new ArrayList<>();
        Question<String> resultado = null;
            resultado = actor -> TextContent.of(Constants.DIV_JOBS(i)).viewedBy(actor).asString();
            lista.add(resultado.toString());
        //System.out.println(lista);
        return resultado;
    }

    public static Question<String> finElements() {
        List<Object> lista = new ArrayList<>();
        Question<String> resultado = null;
        resultado = actor -> TextContent.of(Constants.ELEMENTS).viewedBy(actor).asString();
        lista.add(resultado.toString());
        //System.out.println(lista);
        return resultado;
    }
}
