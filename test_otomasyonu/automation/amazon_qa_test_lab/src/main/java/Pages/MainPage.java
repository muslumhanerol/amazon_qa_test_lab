package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MainPage extends BaseTest {

    public MainPage accountControl(){
        String text = driver.findElements(By.cssSelector("[class='nav-line-2']")).get(1).getText();
        Assert.assertEquals(text, "Sepetii");

        return this;
    }
}
