package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

import static org.junit.Assert.assertEquals;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "InformacoesUsuarioPageObjectsTest.csv")
public class inscricaoPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test
    public void testAddInfoAdicionalDoUsuar(
            @Param(name="login")String login,
            @Param(name="senha")String senha,
            @Param(name="nome")String nome,
            @Param(name="celular")String celular,
            @Param(name="cpf")String cpf,
            @Param(name="cpf1")String cpf1,

            @Param(name="mensagem")String mensagemEsperada
            ){
       String textoToast = new LoginPage(navegador)
                .clicarSignIN()
                .selecionarTicket()
                .fazerLogin(login, senha)
               .preencherDados(nome, celular,cpf)
               .fazerPagamento(cpf1)
                .capturarTextoToast();

        assertEquals(mensagemEsperada, textoToast); // faz a validação.

    }

    @After
    public void tearDown(){
        navegador.quit();
    }
}
