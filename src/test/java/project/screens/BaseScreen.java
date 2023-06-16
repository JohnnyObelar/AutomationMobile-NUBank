package project.screens;


import project.configuration.DriverFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BaseScreen {
        public BaseScreen(){
            PageFactory.initElements( new AppiumFieldDecorator(DriverFactory.getDriver(), Duration.ofSeconds(15) ), this );
        }
}