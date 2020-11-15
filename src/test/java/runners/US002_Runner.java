package runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features ="src/test/resources",
        glue = "stepdefinitions",
<<<<<<< HEAD:src/test/java/runners/US002_Runner.java
        dryRun = false,
        tags = "@AC_004"

)
public class Runner {

=======


        tags = "@login",

        dryRun = false
)
public class Runner {


>>>>>>> master:src/test/java/runners/Runner.java
}