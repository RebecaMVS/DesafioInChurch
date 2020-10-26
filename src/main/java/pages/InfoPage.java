package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InfoPage extends BasePage {
    public InfoPage(WebDriver navegador) {
        super(navegador);
    }


    public InfoPage preencherNome(String nome){
        navegador.findElement(By.className("col-md-4 ng-scope")).findElement(By.className("form-control ng-pristine ng-untouched ng-valid ng-scope ng-isolate-scope ng-empty ng-valid-required")).sendKeys(nome);

        return this;
    }

    public InfoPage preencherCelular(String celular){
        navegador.findElement(By.className("col-md-4 ng-scope")).findElement(By.className("form-control ng-pristine ng-untouched ng-valid ng-scope ng-isolate-scope ng-empty ng-valid-br-phone-number ng-valid-required")).sendKeys(celular);

        return this;
    }

    public InfoPage preencherCPF(String cpf){
        navegador.findElement(By.className("col-md-4 ng-scope")).findElement(By.className("form-control ng-pristine ng-valid ng-scope ng-isolate-scope ng-empty ng-valid-cpf ng-valid-required ng-touched")).sendKeys(cpf);

        return this;
    }

    public Pagamentopage clicarBotaoAvancar(){
        navegador.findElement(By.className("row")).findElement(By.linkText("btn-style-1 pagination-right ng-scope")).click();


        return new Pagamentopage(navegador);
    }


    public Pagamentopage preencherDados(String nome, String celular, String cpf) {
        preencherNome(nome);
        preencherCelular(celular);
        preencherCPF(cpf);
        clicarBotaoAvancar();

        return new Pagamentopage(navegador);
    }

}
