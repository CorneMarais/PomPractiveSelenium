package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    static WebElement element = null;

    public static WebElement menu_button(WebDriver driver){

        element = driver.findElement(By.id("react-burger-menu-btn"));
        return element;
    }

    public static WebElement cart_button(WebDriver driver){

        element = driver.findElement(By.className("shopping_cart_link"));
        return element;
    }

    public static WebElement filter_button(WebDriver driver){

        element = driver.findElement(By.className("product_sort_container"));
        return element;
    }






}
