package pages;

import org.openqa.selenium.WebDriver;

public class GooglePage {

    private WebDriver driver;

    public GooglePage(WebDriver driver){

        this.driver = driver;

    }

    public void acessarGoogle(){

        driver.get("https://www.google.com");

    }

    public String obterTitulo(){

        return driver.getTitle();

    }

}