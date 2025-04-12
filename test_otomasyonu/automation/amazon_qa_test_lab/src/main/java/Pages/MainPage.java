package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MainPage extends BaseTest {

    @Step("Siparişler bilgisi kontrol edilir.")
    public MainPage accountControl(){
        String text = driver.findElements(By.cssSelector("[class='nav-line-2']")).get(0).getText();
        Assert.assertEquals(text, "ve Siparişler");
        screenshot();
        return this;
    }
}
