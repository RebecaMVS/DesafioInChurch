package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver navegador) {
        super(navegador);
    }


    public LoginFormPage clicarSignIN(){
        navegador.findElement(By.linkText("Sign in")).click();

        return new LoginFormPage(navegador);
    }

    public LoginPage digitarLogin(String login){
        navegador.findElement(By.id("ng-binding")).findElement(By.name("email")).sendKeys(login);

        return this;
    }

    public LoginPage digitarPassword(String password){
        navegador.findElement(By.id("ng-binding")).findElement(By.name("password")).sendKeys(password);

        return this;
    }

    public InfoPage clicarEntrar(){
        navegador.findElement(By.linkText("myButton")).click();

        return new InfoPage(navegador);
    }

    public InfoPage fazerLogin(String login, String senha) {
        digitarLogin(login);
        digitarPassword(senha);
        clicarEntrar();


        return new InfoPage(navegador);
    }
}
