package pages;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox emailTextBox = new TextBox(By.xpath("//input[@id='email']"));
    public TextBox pwdTextBox= new TextBox(By.xpath("//input[@id='password']"));
    public Button loginButton= new Button(By.xpath("//button[contains(@class,'login')]"));
}
