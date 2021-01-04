package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@RegistrationSteps",
        features = "src/test/resources",
        glue = "stepsDefenitions"

)
public class TestRunner {

}