package br.com.Actions;

import br.com.PageObjects.HomePageObjects;
import br.com.PageObjects.IndicarAmigosPageObjects;
import org.junit.Assert;

public class ActionsMenu {

    public static void validarIndicarAmigos() throws InterruptedException {
        Thread.sleep(8000);
        HomePageObjects.elementsMenu("Indicar amigos").click();
        Thread.sleep(2000);
       // Assert.assertTrue(IndicarAmigosPageObjects.elementsMenu().getText().contains("Por onde você quer indicar seu amigo?"));

    }



}
