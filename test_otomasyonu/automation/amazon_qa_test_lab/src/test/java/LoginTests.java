import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test
    public void basariliGiris() {
        loginPage.fillEmail(email)
                .clickLoginEmail()
                .fillPassword(password)
                .clickLoginPaaword();
        sleep(3000);

        mainPage.accountControl();
    }

    @Test
    public void basarisizGiris() {
        loginPage.fillEmail(email)
                .clickLoginEmail()
                .fillPassword(password)
                .clickLoginPaaword();
        sleep(3000);

       loginPage.errorMessageController("Şifreniz yanlış");

    }
}

//Eski Hali
//@Test
//public void basarisizGiris() throws InterruptedException {
    //driver.findElement(By.id("ap_email")).sendKeys(email);
    //driver.findElement(By.cssSelector("[class='a-button-input']")).click();
    //driver.findElement(By.id("ap_password")).sendKeys("AMAZONDENEME123");
        //driver.findElement(By.cssSelector("[class='a-button-input']")).click();

    //String text = driver.findElement(By.cssSelector("[class='a-alert-content']")).getText();
    //System.out.println(text);
    //Assert.assertEquals(text, "Şifreniz yanlış");

    //}
