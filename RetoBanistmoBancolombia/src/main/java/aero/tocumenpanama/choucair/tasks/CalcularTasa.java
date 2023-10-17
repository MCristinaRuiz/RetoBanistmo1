package aero.tocumenpanama.choucair.tasks;


import Models.Calculo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static aero.tocumenpanama.choucair.userinterfaces.MenuPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CalcularTasa implements Task {
    private final Map<String, String > calculo;

    public CalcularTasa(Map<String, String > calculo ) {
        this.calculo = calculo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.angularRequestsHaveFinished(),
                WaitUntil.the(LNK_NEGOCIOS, isVisible()),
                Click.on(LNK_NEGOCIOS),
                WaitUntil.the(LNK_HERRAMIENTAS, isVisible()),
                Click.on(LNK_HERRAMIENTAS),
                Scroll.to(BTN_DESPLAZAR),
                Click.on(BTN_DESPLAZAR),
                WaitUntil.the(LNK_AMPLIAR_CONOCIMIENTO_NEGOCIO, isVisible()),
                Click.on(LNK_AMPLIAR_CONOCIMIENTO_NEGOCIO),
                Click.on(LNK_CONVERTIDOR_TASA),
                Click.on(LNK_TASA_NOMINAL),
                Enter.keyValues(calculo.get("Interes")).into(TXT_TASA_INTERES),
                Enter.theValue(calculo.get("Capitalizacion")).into(TXT_CAPITALIZACION),
                Enter.theValue(calculo.get("Periodicidad")).into(TXT_PERIODICIDAAD)

        );

    }
    public static CalcularTasa enBancolombia(Calculo calculo){
        return Tasks.instrumented(CalcularTasa.class, calculo);
    }
}
