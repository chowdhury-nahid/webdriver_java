package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Nahid Chowdhury
 * Date: 4/19/2022
 * Time: 2:34 AM
 */

public class SecureAreaPage {

    private WebDriver driver;
    private By flashMessage = By.cssSelector("#flash");

    public SecureAreaPage(WebDriver driver){
        this.driver=driver;
    }

    public String getFlashMessage(){
        return driver.findElement(flashMessage).getText();
    }
}
