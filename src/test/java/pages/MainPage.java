package pages;

import controlSelenium.Imagen;
import org.openqa.selenium.By;

public class MainPage {

    public Imagen loginImage= new Imagen(By.xpath("(//a[contains(@href,'showlogin')])[1]"));
}
