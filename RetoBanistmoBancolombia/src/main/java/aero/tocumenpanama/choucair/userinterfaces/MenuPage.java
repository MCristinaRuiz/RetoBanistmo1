package aero.tocumenpanama.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class MenuPage {

    public static final Target LNK_NEGOCIOS = Target.the("Link negocios")
            .located(By.id("header-pymes"));

    public static final Target LNK_HERRAMIENTAS = Target.the("Link herramientas")
            .locatedBy("(//a[contains(@href,'negocios')])[6]");

    public static final Target BTN_DESPLAZAR = Target.the("Boton desplazar")
            .locatedBy("(//i[@class='bc-icon bc-sm'])[1]");

    public static final Target LNK_AMPLIAR_CONOCIMIENTO_NEGOCIO = Target.the("Link ampliar conocimiento de mi negocio")
            .locatedBy("(//div[@class='menu-item-link'])[7]");
    public static final Target LNK_CONVERTIDOR_TASA = Target.the("Link convertidor tasa")
            .locatedBy("(//p[@id='textCard'])[5]");
    public static final Target LNK_TASA_NOMINAL = Target.the("Link tasa niminal")
            .locatedBy(("(//a[contains(text(),'Calcular')])[1]"));
    public static final Target TXT_TASA_INTERES = Target.the("Campo tasa de interes")
            .located(By.id("interes2lar')])[1]"));
    public static final Target TXT_CAPITALIZACION = Target.the("Campo capitalizacion")
            .located(By.id("capitalizacion2"));
    public static final Target TXT_PERIODICIDAAD = Target.the("Campo periocidad")
            .located(By.id("periocidad2"));
    public static final Target VALIDACION = Target.the("Validacion")
            .located(By.id("respuesta2"));

    private MenuPage() {
    }
}
