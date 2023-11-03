package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {

    static WebElement element = null;

    public static WebElement first_name(WebDriver driver){

        element = driver.findElement(By.id("first-name"));
        return element;
    }

    public static WebElement last_name(WebDriver driver){

        element = driver.findElement(By.id("last-name"));
        return element;
    }

    public static WebElement zip_code(WebDriver driver){

        element = driver.findElement(By.id("postal-code"));
        return element;
    }

    public static WebElement Continue_1(WebDriver driver){

        element = driver.findElement(By.id("continue"));
        return element;
    }

    public static WebElement cancel(WebDriver driver){

        element = driver.findElement(By.id("cancel"));
        return element;

    }

}
