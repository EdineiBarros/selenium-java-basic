package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GooglePage;
import utils.DriverFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleSteps {

    GooglePage google = new GooglePage(DriverFactory.getDriver());

    @Given("que o usuário acessa o Google")
    public void acessarGoogle() {

        google.acessarGoogle();

    }

    @Then("o título da página deve ser {string}")
    public void validarTitulo(String tituloEsperado) {

        assertEquals(tituloEsperado, google.obterTitulo());

    }

}