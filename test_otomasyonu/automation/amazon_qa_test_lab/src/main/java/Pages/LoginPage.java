package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseTest {

    @Step("E-posta alanı dolduruldu.")
    public LoginPage fillEmail (String email){
        driver.findElement(By.id("ap_email")).sendKeys(email);
        return this;
    }

    @Step("Devam et butonuna tıklanır.")
    public LoginPage clickLoginEmail(){
        driver.findElement(By.cssSelector("[class='a-button-input']")).click();
        return this;

    }

    @Step("Parola alanı dolduruldu.")
    public LoginPage fillPassword (String password){
        driver.findElement(By.id("ap_password")).sendKeys(password);
        return this;
    }

    @Step("Giris yap butonuna tıklanır.")
    public LoginPage clickLoginPassword(){
        driver.findElement(By.cssSelector("[class='a-button-input']")).click();
        return this;

    }

    @Step("Hata mesajı kontrol edildi.")
    public  LoginPage errorMessageController(String value){

        String text = driver.findElement(By.cssSelector("[class='a-alert-content']")).getText();
        Assert.assertEquals(text, value);
        screenshot();
        return this;
    }
}
