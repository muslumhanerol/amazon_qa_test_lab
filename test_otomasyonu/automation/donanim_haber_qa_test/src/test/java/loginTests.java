import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTests {

    @Test
    public void basariliGiris(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://forum.donanimhaber.com/login?returnUrl=https://www.donanimhaber.com&token=&type=&Platform=");
        driver.findElement(By.id("LoginName")).sendKeys("mslmhanerol@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Denemedonanim123");
        driver.findElement(By.id("SubmitButton")).click();
    }
}





