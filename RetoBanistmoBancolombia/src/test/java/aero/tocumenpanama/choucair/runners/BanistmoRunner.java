package aero.tocumenpanama.choucair.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/banistmo.feature",
        glue = {"aero.tocumenpanama.choucair.setup", "aero.tocumenpanama.choucair.stepdefinitions"},
        tags = "@testBanistmo",
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)
public class BanistmoRunner {
}
