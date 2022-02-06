package br.com.StepsDefinitions;

import br.com.Actions.ActionsMenu;
import br.com.support.Connection;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


@DisplayName("Teste Mobile de indicação de amigos")
public class ValidarCampoIndicarAmigos extends Connection {

    @DisplayName("Validar campo Indicar Amigos")
    @Test
    public void ValidarIndicarAmigos() throws InterruptedException {
        ActionsMenu.validarIndicarAmigos();
    }

    //teste
}
