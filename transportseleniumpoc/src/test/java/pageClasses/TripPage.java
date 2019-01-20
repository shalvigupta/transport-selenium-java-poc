package pageClasses;

import commonUtils.ActionsBaseHooks;
import commonUtils.BaseHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class TripPage extends BaseHooks {

    ActionsBaseHooks actionsUI = new ActionsBaseHooks();

    @FindBy(id = "search-input-From")
    WebElement fromInput;

    @FindBy(id="search-input-To")
    WebElement toInput;

    @FindBy(id="search-button")
    WebElement goButton;

    @FindBy(xpath="//div[@role='listitem']")
    WebElement listItems;

    @FindBy(xpath = "")
    WebElement firstSuggestion;

    public void setTextToField(String field , String text){

        actionsUI.waitForElement(fromInput);

        if(field.equalsIgnoreCase("From"))
        actionsUI.sendKeysInElement(fromInput, text);
        else if(field.equalsIgnoreCase("to"))
            actionsUI.sendKeysInElement(toInput, text);
    }

    public void clickFirstBox(){
        actionsUI.clickElement(fromInput);
        //Application flickers so had to add it
        // Tried with Explicit and Implicit wait didn't work
        //As a last resort added it
        try {
            Thread.sleep(1000);
        }catch (InterruptedException E){
            E.getMessage();
        }

    }
    public void clickGoButton(){
        actionsUI.waitForElement(goButton);
        actionsUI.clickElement(goButton);
    }

    public boolean listItemsPresent(){
        actionsUI.waitForElement(listItems);
        List <WebElement> list = driver.findElements(By.xpath("//div[@role='listitem']"));
        if(list.size()>0){
            return true;
        }else {
            return false;
        }

    }
}
