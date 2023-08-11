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

        element = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        return element;
    }

    public static WebElement filter_button(WebDriver driver){

        element = driver.findElement(By.className("product_sort_container"));
        return element;
    }

    public static WebElement add_to_cart_Backpack(WebDriver driver){

        element = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        return element;
    }

    public static WebElement add_to_cart_Bike(WebDriver driver){

        element = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        return element;
    }






}
