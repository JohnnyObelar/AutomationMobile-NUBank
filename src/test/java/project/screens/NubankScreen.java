package project.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NubankScreen extends BaseScreen {


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Indicar amigos']")
    private MobileElement btnIndicarAmigo;

    @AndroidFindBy(xpath = "xpath=//a[contains(text(),'Por onde você quer indicar seu amigo?')]")
    private MobileElement modalAmigo;

    public MobileElement getBtnIndicarAmigo() {
        return btnIndicarAmigo;
    }

    public MobileElement getModalAmigo() {
        return modalAmigo;
    }





}