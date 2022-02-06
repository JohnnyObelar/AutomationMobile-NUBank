package br.com.PageObjects;

import br.com.support.Connection;
import io.appium.java_client.MobileElement;

public class IndicarAmigosPageObjects extends Connection {

    public static MobileElement elementsMenu(){
        MobileElement element = null;
        try{
            element   = driver.findElementByXPath("//android.widget.TextView[@text='Por onde você quer indicar seu amigo?']");
        }
        catch (Exception e){
            e.getMessage();
            System.out.println("Elemento não encontrado");
        }
        return element;

    }
}
