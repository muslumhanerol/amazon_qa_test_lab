import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void basariliGiris() throws InterruptedException {
        driver.findElement(By.id("ap_email")).sendKeys(email);
        driver.findElement(By.cssSelector("[class='a-button-input']")).click();
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.cssSelector("[class='a-button-input']")).click();

        String text = driver.findElements(By.cssSelector("[class='nav-line-2']")).get(1).getText();
        System.out.println(text);
        Assert.assertEquals(text, "Sepetii");
    }

    @Test
    public void basarisizGiris() throws InterruptedException {
        driver.findElement(By.id("ap_email")).sendKeys(email);
        driver.findElement(By.cssSelector("[class='a-button-input']")).click();
        driver.findElement(By.id("ap_password")).sendKeys("AMAZONDENEME123");
        driver.findElement(By.cssSelector("[class='a-button-input']")).click();

        String text = driver.findElement(By.cssSelector("[class='a-alert-content']")).getText();
        System.out.println(text);
        Assert.assertEquals(text, "Şifreniz yanlış");

    }
}
