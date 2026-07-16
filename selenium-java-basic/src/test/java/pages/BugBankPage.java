package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DataUtils;

import static utils.DriverFactory.getDriver;

public class BugBankPage extends BasePage {

    private final By buttonRegistrar = By.xpath("//button[contains(text(),'Registrar')]");
    private final By inputRegisterEmail = By.xpath("//div[@class='card__register']//input[@name='email']");
    private final By inputRegisterNome = By.xpath("//div[@class='card__register']//input[@name='name']");
    private final By inputRegisterSenha = By.xpath("//div[@class='card__register']//input[@name='password']");
    private final By inputRegisterSenha2 = By.xpath("//div[@class='card__register']//input[@name='passwordConfirmation']");
    private final By toggleSaldo = By.xpath("//label[@id='toggleAddBalance']");
    private final By botaoCadastrar = By.xpath("//button[contains(text(),'Cadastrar')]");

    private final WebDriver driver = getDriver();

    public BugBankPage(WebDriver driver) {
        super(driver);
    }


    public void acessarBugBank() {

        driver.get(ConfigReader.getProperty("urlBugBank"));
    }

    public String obterTitulo() {

        return driver.getTitle();

    }

    public void clicarButtonRegistrar() {

        driver.findElement(buttonRegistrar).click();
        esperarClicavel(inputRegisterEmail);

    }

    public void preencherCadastro(boolean criarContaComSaldo) {
        String email = DataUtils.gerarEmail();
        String nome = DataUtils.gerarNome();
        String senha = DataUtils.gerarSenha();

        driver.findElement(inputRegisterEmail).click();
        driver.findElement(inputRegisterEmail).sendKeys(email);
        driver.findElement(inputRegisterNome).click();
        driver.findElement(inputRegisterNome).sendKeys(nome);
        driver.findElement(inputRegisterSenha).click();
        driver.findElement(inputRegisterSenha).sendKeys(senha);
        driver.findElement(inputRegisterSenha2).click();
        driver.findElement(inputRegisterSenha2).sendKeys(senha);

        if (criarContaComSaldo) {
            driver.findElement(toggleSaldo).click();
        }
    }

    public void clicarButtonCadastrar() {

        driver.findElement(botaoCadastrar).click();

    }


}
