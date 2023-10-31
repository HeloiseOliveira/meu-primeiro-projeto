package br.com.juliodelima.taskit.signup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes Automatizados da Ferramenta Signup")

public class SignUpTests {
@Test
    @DisplayName("Registrar um novo usuário com dados válidos")
    public void testRegistrarUmNovoUsuarioComDadosValidos() {
    //Vou abrir o Chrome
    WebDriverManager.chromedriver().setup();
    WebDriver navegador = new ChromeDriver();

    //Abrir o site Taskit
    navegador.get("https://kinsta.com/pt/blog/melhores-praticas-html/");

    //Vou clicar no botão que tem o ID igual a signup
    navegador.findElement(By.id("search-form-container")).click();

}
}
