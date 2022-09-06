package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "./src/test/java/features/SampleTest.feature",// path of the feature file
        glue = "step_definitions", //glue defines where our step definition code is written
        dryRun = false, // it will map both feature file and step definition and check whether any missing code snippets
        monochrome = true, //used to print the steps in console
        plugin = {"pretty", "html:target/report.html"}, //used to print and genertate report
        tags = "@SmokeTest"
)

public class CucumberRunner extends AbstractTestNGCucumberTests {
}
