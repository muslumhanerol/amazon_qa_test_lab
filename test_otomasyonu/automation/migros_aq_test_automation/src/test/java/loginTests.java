import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class loginTests {

    @Test

    public void basariliGiris(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.migros.com.tr/giris");
        driver.findElement(By.id("login-page-phone-number")).sendKeys("313840874");

    }
}
