import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestandoSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com/");
    }
}
