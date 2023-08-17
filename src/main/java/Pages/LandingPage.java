package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public static final String id_menu_button = "react-burger-menu-btn";
    public static final String xp_cart_button = "//a[@class='shopping_cart_link']";
    public static final String cn_filter_button = "product_sort_container";
    public static final String id_add_to_cart_backpack = "add-to-cart-sauce-labs-backpack";
    public static final String id_add_to_cart_bike = "add-to-cart-sauce-labs-bike-light";

    static WebElement element = null;

    public static WebElement menu_button(WebDriver driver){

        element = driver.findElement(By.id(id_menu_button));
        return element;
    }

    public static WebElement cart_button(WebDriver driver){

        element = driver.findElement(By.xpath(xp_cart_button));
        return element;
    }

    public static WebElement filter_button(WebDriver driver){

        element = driver.findElement(By.className(cn_filter_button));
        return element;
    }

    public static WebElement add_to_cart_Backpack(WebDriver driver){

        element = driver.findElement(By.id(id_add_to_cart_backpack));
        return element;
    }

    public static WebElement add_to_cart_Bike(WebDriver driver){

        element = driver.findElement(By.id(id_add_to_cart_bike));
        return element;
    }






}
