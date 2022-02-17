package br.Screens;

import br.Helper.ElementsHelper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class NubankScreen extends BasePage {

    @AndroidFindBy(xpath = "xpath=//a[contains(text(),'Indicar amigos')]")
    public RemoteWebElement btnIndicarAmigo;

    @AndroidFindBy(xpath = "xpath=//a[contains(text(),'Por onde você quer indicar seu amigo?')]")
    public RemoteWebElement modalAmigo;




    public String btnIndicarAmigo() {
        ElementsHelper.waitForElementToLoad(btnIndicarAmigo, 2).click();
        return btnIndicarAmigo.getText();
    }

    public String modalAmigo() {
        ElementsHelper.waitForElementToLoad(modalAmigo, 2).click();
        return modalAmigo.getText();
    }


}