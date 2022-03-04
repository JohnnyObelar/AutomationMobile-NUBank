package project.configuration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static AppiumDriver<MobileElement> appiumDriver;

    public static AppiumDriver<MobileElement> createDriver() {

        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("platformName", "Android");
            cap.setCapability("deviceName", "emulator-5554");
            cap.setCapability("automationName", "Uiautomator2");
            cap.setCapability(MobileCapabilityType.APP, "C:/Users/Johnny/Documents/AutomacaoMobile/nuclone.apk");
            //desiredCapabilities.setCapability("appPackage","com.android.calculator2");
            //desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");

            appiumDriver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), cap);
        } catch (MalformedURLException e) {
            System.out.println( e.getMessage() );
        }

        return appiumDriver;
    }

        public static AppiumDriver<MobileElement> getDriver()  {
            if (appiumDriver == null){
                return createDriver();
            }
            return  appiumDriver;
        }

        public static void closeDriver(){
            appiumDriver.quit();

        }

        public static void relaunchApp() {
            appiumDriver.launchApp();
        }

}