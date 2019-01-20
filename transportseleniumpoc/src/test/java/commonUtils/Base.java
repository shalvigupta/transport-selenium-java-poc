package commonUtils;

import org.openqa.selenium.WebDriver;

public class Base {

    public WebDriver driver;
    public Base(){
       this.driver = BaseHooks.driver;

    }
}
