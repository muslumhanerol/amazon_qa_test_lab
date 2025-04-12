package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    public LoginPage fillEmail (String email){
        driver.findElement(By.id("ap_email")).sendKeys(email);
        return this;
    }

    public LoginPage clickLoginEmail(){
        driver.findElement(By.cssSelector("[class='a-button-input']")).click();
        return this;

    }

    public LoginPage fillPassword (String password){
        driver.findElement(By.id("ap_password")).sendKeys(password);
        return this;
    }

    public LoginPage clickLoginPaaword(){
        driver.findElement(By.cssSelector("[class='a-button-input']")).click();
        return this;

    }

}
