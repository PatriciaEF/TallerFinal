package browser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ChromeProxy implements IBrowser {
 //   @Override
    public ChromeDriver create() {
        String path = "src/test/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        //Proxy
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("127.0.0.1:9090");
        proxy.setSslProxy("127.0.0.1:9090");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("proxy",proxy);

        Map<String,Object> prefs= new HashMap<>();
        prefs.put("credential_enable_service",false);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("ignore-certificate-errors");
        chromeOptions.setExperimentalOption("prefs",prefs);

        capabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions);

        ChromeDriver driver = new ChromeDriver(capabilities);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        return driver;

    }
}
