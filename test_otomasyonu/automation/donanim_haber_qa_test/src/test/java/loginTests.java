import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTests {

    @Test
    public void basariliGiris(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://forum.donanimhaber.com/login?returnUrl=https://www.donanimhaber.com&token=&type=&Platform=");
        driver.findElement(By.id("LoginName")).sendKeys("kafolik297@provko.com");
        driver.findElement(By.name("Password")).sendKeys("Denemedonanim123");
        driver.findElement(By.id("SubmitButton")).click();

        driver.quit();
    }

    @Test
    public void basarisizGiris(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://forum.donanimhaber.com/login?returnUrl=https://www.donanimhaber.com&token=&type=&Platform=");
        driver.findElement(By.id("LoginName")).sendKeys("kafolik297@provko.com");
        driver.findElement(By.name("Password")).sendKeys("Denemedonanim");
        driver.findElement(By.id("SubmitButton")).click();

        driver.quit();
    }
}





