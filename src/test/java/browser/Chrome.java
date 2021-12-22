package browser;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome implements IBrowser{
    @Override
    public ChromeDriver create(){
        String path= "src/test/resources/chromedriver.exe";
        System.setProperty("webdriver.com.pe",path);

        ChromeDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                return driver;
    }
}
