package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage {
    public LoginFormPage(WebDriver navegador) {
        super(navegador);
    }



    public LoginFormPage clicarPlus(){
        navegador.findElement(By.className("fa fa-plus font-lg")).click();

        return this;
    }

    public LoginPage clicarAvancar(){
        navegador.findElement(By.className("btn-style-1 ng-binding ng-scope")).click();

        return new LoginPage(navegador);
    }

    public LoginPage selecionarTicket() {
        clicarPlus();
        clicarAvancar();

        return new LoginPage(navegador);
    }

}