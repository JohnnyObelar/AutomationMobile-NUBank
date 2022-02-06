package br.com.support;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Connection {

     public static AndroidDriver<MobileElement> driver;


    @BeforeClass
    public static void startAppium() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "Uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Johnny\\Documents\\AutomacaoMobile\\nuclone.apk");
        //desiredCapabilities.setCapability("appPackage","com.android.calculator2");
        //desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);


    }

    @AfterClass
    public static void finishAppium() {
        driver.quit();
    }

}
