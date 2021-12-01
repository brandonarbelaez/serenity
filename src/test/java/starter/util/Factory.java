package starter.util;

import starter.stepdefinitions.SophosStepDefinitions;

public class Factory {

    public static void call(){
        SophosStepDefinitions sophosStepDefinitions = new SophosStepDefinitions();
        sophosStepDefinitions.obtener_ofertas();
        sophosStepDefinitions.imprimir_resultado();

    }

}
