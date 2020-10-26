package suporte;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Web {

    @Test

    public static WebDriver createChrome() {
//        Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Automação\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        Navegando para a pasta do site
        navegador.get("https://qa-suaigreja.inchurch.com.br/#/events/2574");

        return navegador;
    }

}
