package testUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginModal;
import pages.MainPage;
import pages.MenuSection;
import session.Session;

public class LoginTest {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection= new MenuSection();
    @BeforeEach
    public void openBrowser(){
        Session.getSession().getDriver().get("https://todoist.com/");
    }
    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeBrowser();
    }

    @Test
    public void verifyLoginSuccessfully() throws InterruptedException {
        mainPage.loginImage.click();
        Thread.sleep(1000);
        loginModal.emailTextBox.setText("patriciaef.0103@gmail.com");
        loginModal.pwdTextBox.setText("Patricia$1");
        loginModal.loginButton.click();

        Assertions.assertTrue(menuSection.logoutLabel.isControlDisplayed(),"ERROR! login was not successfully");

    }
}