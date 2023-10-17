package aero.tocumenpanama.choucair.stepdefinitions;

import Models.Calculo;
import aero.tocumenpanama.choucair.tasks.CalcularTasa;
import aero.tocumenpanama.choucair.userinterfaces.MainPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import net.serenitybdd.screenplay.actions.Open;


import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;


public class BanistmoStepDefinition {


    @Dado("que {} ingresa a la aplicacion de Bancolombia")
    public void queCristinaIngresaALaAplicacionDeBancolombia(String actor) {

        theActorCalled(actor).wasAbleTo(
                Open.browserOn().the(MainPage.class)
        );
    }

    @Cuando("calcule la tase de interes")
    public void calculeLaTasedeInteres(Map<String, String > calculo) {

        theActorInTheSpotlight().attemptsTo(

        );

    }

    @Entonces("puede visualizar la tasa de interes calculada")
    public void puedeVisualizarLaTasaDeInteresCalculada() {

        theActorInTheSpotlight().should(

        );
    }

}

