package br.RunnerTest;

import br.Configuration.DriverFactory;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import java.net.MalformedURLException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src//test//resources//features"}
        , glue = {"steps", "DriverFactory"}
        , plugin = {"pretty", "html:target/cucumber"}
        , tags = "@soma")



//
//        tags = "@soma",
//        plugin = {"pretty", "html:target/cucumberHtmlReport"},   dryRun = false,
//        glue = "steps","Screens")

public class RunnerTest {
    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DriverFactory.createDriverByParameter("Android");
    }

    @AfterClass
    public static void tearDown(){
        DriverFactory.quitDriver();
    }
}
