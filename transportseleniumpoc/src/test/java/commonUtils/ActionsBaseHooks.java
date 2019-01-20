package commonUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsBaseHooks extends Base{

    public void getUrl(String url){
        driver.get(url);
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void sendKeysInElement(WebElement element, String keys){
        element.sendKeys(keys);
    }

    public String getTextFromElement(WebElement element){
        return element.getText();
    }

}
