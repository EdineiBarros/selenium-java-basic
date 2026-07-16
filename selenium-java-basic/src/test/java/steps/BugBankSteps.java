package steps;

import io.cucumber.java.pt.*;
import pages.BugBankPage;
import utils.DriverFactory;

public class BugBankSteps {

    BugBankPage bugBankPage = new BugBankPage(DriverFactory.getDriver());

    @Dado("que o usuário acessa o bugbank")
    public void que_o_usuário_acessa_o_bugbank() {
        bugBankPage.acessarBugBank();
    }
    @Entao("A página do bugbank é exibida")
    public void a_página_do_bugbank_é_exibida() {
        bugBankPage.obterTitulo();
    }

    @Dado("clica em registrar")
    public void clica_em_registrar() {
        bugBankPage.clicarButtonRegistrar();
    }
    @Dado("preenche as informações")
    public void preenche_as_informações() {
        bugBankPage.preencherCadastro(true);
    }
    @Quando("clica em cadastrar")
    public void clica_em_cadastrar() {
        bugBankPage.clicarButtonCadastrar();
    }
    @Entao("valida a mensagem de sucesso")
    public void valida_a_mensagem_de_sucesso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
