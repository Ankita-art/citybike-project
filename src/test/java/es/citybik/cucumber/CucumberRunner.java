package es.citybik.cucumber;

import cucumber.api.CucumberOptions;
import es.citybik.testbase.TestBase;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Ankita
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/es/citybik/resources/feature/citybik.feature/")
public class CucumberRunner extends TestBase {

}
