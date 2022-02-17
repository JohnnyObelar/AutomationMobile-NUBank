package br.steps;

import br.Screens.NubankScreen;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class nubankStep extends NubankScreen {

    @Dado("clico no botão para indicar amigo")
    public void clico_no_botão_para_indicar_amigo() {
        btnIndicarAmigo();
    }
    @Então("a modal de indicar amigo deve ser apresentada")
    public void a_modal_de_indicar_amigo_deve_ser_apresentada() {
        modalAmigo();
    }

}
