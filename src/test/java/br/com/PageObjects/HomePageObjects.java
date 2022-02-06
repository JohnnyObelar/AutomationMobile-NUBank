package br.com.PageObjects;

import br.com.support.Connection;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

public class HomePageObjects extends Connection {

    public static MobileElement elementsMenu(String text){
        MobileElement element = null;
        try{
            //element = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]\n");
            element   = driver.findElementByXPath("//android.widget.TextView[@text='" + text + "']");
        }
        catch (Exception e){
            e.getMessage();
            System.out.println("Elemento não encontrado");
        }
        return element;
    }




   /* public static List<MobileElement> elementosMenu(){
        List<MobileElement> element = null;
        try{
            //element = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]\n");
            element   = driver.findElements(By.xpath("android.view.ViewGroup[1]"));
        }
        catch (Exception e){
            e.getMessage();
        }
        return element;
    }*/





    /*public static MobileElement elementosMenu2(){
        MobileElement element = null;
        try{
            //element = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]\n");
            List<MobileElement> element   = driver.findElements(By.className("android.view.ViewGroup"));
        }
        catch (Exception e){
            e.getMessage();
        }
        return element;
    }*/


  //  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));

}
