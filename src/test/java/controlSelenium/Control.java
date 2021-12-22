package controlSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class Control {
    protected By locator;
    protected WebElement control;

    public Control(By locator) {
        this.locator = locator;
    }
    public void findControl() {
        this.control = Session.getSession().getDriver().findElement(this.locator);
    }
    public String getText() {
        this.findControl();
        return this.control.getText();
    }

    public void click(){
        this.findControl();
        this.control.click();
    }

    public boolean isControlDisplayed() {
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
}
