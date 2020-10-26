package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pagamentopage extends BasePage {
    public Pagamentopage(WebDriver navegador) {
        super(navegador);
    }

    public Pagamentopage clicarOpcaoBoleto() {
        navegador.findElement(By.className("well center-form ng-pristine ng-invalid ng-invalid-required ng-valid-credit-card ng-valid-minlength ng-valid-maxlength")).findElement(By.className("payment-button")).click();

        return this;
    }

    public Pagamentopage preencherCPF1(String cpf1){
        navegador.findElement(By.className("col-md-4 ng-scope")).findElement(By.name("cpf")).sendKeys(cpf1);

        return this;
    }

    public Ticketpage clicarBotaoFinalizar() {
        navegador.findElement(By.xpath("btn-style-1 pull-right ng-binding")).click();

        return new Ticketpage(navegador);
    }

    public Ticketpage fazerPagamento(String cpf1){

        clicarOpcaoBoleto();
        preencherCPF1(cpf1);
        clicarBotaoFinalizar();

        return new Ticketpage(navegador);
    }

}
