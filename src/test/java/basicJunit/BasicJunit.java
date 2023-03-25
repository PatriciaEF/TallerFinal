package basicJunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import session.Session;

public class BasicJunit {
    @Test
    public void verifySomeThing() throws InterruptedException {
        System.out.println("this is my test");
        Session.getSession().getDriver().get("http://todo.ly/");
        Thread.sleep(10000);
    }
    @BeforeEach
    public void setup(){
        System.out.println("before");
    }
    @AfterEach
    public void cleanup(){
        System.out.println("after    ");
    }
}
