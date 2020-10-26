package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Esta classe serve para que ao criar uma nova classe não haja a necessidade de colocar métodos recorrentes

public class BasePage {
    protected WebDriver navegador;

    public BasePage(WebDriver navegador){
        this.navegador = navegador;
    }

    public String capturarTextoToast(){
        return navegador.findElement(By.className("modal-title ng-binding")).getText();
    }
}
