package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Contact_Us_Steps {
    private ChromeDriver navegador;
    
    @Before
    public void setup(){
    WebDriverManager.chromedriver().setup();
    ChromeDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
    }
    @After
    public void tearDown() {
    navegador.quit();
}


    @Given("I acess the webdriver university contact us page")
    public void i_acess_the_webdriver_university_contact_us_page() throws InterruptedException {
    navegador.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
    Thread.sleep(3000);
    }

    @When("I enter a firts name")
    public void i_enter_a_firts_name() {

    }
    @And("I enter a last name")
    public void i_enter_a_last_name() {

    }
    @And("I enter a email address")
    public void i_enter_a_email_address() {

    }
    @And("I enter a comment")
    public void i_enter_a_comment() {

    }
    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {

    }
    @Then("I should be presented with a sucessful contact us submission message")
    public void i_should_be_presented_with_a_sucessful_contact_us_submission_message() {

    }
}
