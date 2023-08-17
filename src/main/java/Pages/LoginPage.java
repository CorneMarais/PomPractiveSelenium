package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public static final String id_username = "user-name";
    public static final String id_password = "password";
    public static final String id_login_button = "login-button";

    static WebElement element = null;

    public static WebElement username(WebDriver driver) {

        element = driver.findElement(By.id(id_username));
        return element;
    }

    public static WebElement password(WebDriver driver){

        element = driver.findElement(By.id(id_password));
        return element;
    }

    public static WebElement login_button(WebDriver driver){

        element = driver.findElement(By.id(id_login_button));
        return element;
    }
}
