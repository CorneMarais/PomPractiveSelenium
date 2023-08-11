package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {

    static WebElement element = null;

    public static WebElement checkout_bt(WebDriver driver){

        element = driver.findElement(By.id("checkout"));
        return element;
    }

    public static WebElement continue_shopping(WebDriver driver){

        element = driver.findElement(By.id("continue-shopping"));
        return element;
    }



    }

