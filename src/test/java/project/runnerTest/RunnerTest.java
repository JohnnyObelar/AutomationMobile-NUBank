package project.runnerTest;

import project.configuration.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@nubank",
        features = "src/test/java/project",
        glue = "",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber"})

public class RunnerTest {

    @BeforeClass
    public static void tearUp(){
        DriverFactory.getDriver();
    }

    @AfterClass
    public static void tearDown(){
        DriverFactory.closeDriver();
    }
}
