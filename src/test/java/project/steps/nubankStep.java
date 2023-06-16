package project.steps;

import project.screens.NubankScreen;
import io.cucumber.java.pt.Dado;

public class nubankStep {

    private NubankScreen Nunbankscreen = new NubankScreen();

    @Dado("clico no botão para indicar amigo")
    public void clico_no_botão_para_indicar_amigo() throws InterruptedException {
            Nunbankscreen.getBtnIndicarAmigo().click();
            Thread.sleep(10000);
    }


//    @Então("a modal de indicar amigo deve ser apresentada")
//    public void a_modal_de_indicar_amigo_deve_ser_apresentada() {
//        modalAmigo();
//    }

}
