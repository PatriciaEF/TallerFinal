package session;

import browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session {
    private static Session session = null;
    private WebDriver driver;
    private Session() {
        driver= FactoryBrowser.make("proxy").create();
    }

    public static Session getSession(){
        if (session==null){
            session=new Session();
        }
        return session;
    }

    public void closeBrowser(){
        session=null;
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
