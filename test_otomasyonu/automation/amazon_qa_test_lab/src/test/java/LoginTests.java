import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests {
    @Test
    public void basariliGiris(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.id("ap_email")).sendKeys("hopami8062@ptiong.com");
        driver.findElement(By.cssSelector("[class='a-button-input']")).click();
        driver.findElement(By.id("ap_password")).sendKeys("AMAZONDENEME");
        driver.findElement(By.cssSelector("[class='a-button-input']")).click();


    }
}
