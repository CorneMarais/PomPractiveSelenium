package Negative;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {

    public static WebDriver driver = null;

    public static void main(String[] args){


    }

    @BeforeTest
    public static void test_setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Corne\\Downloads\\chromedriver-win64\\chromedriver-win64");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public static void fail_login(){

        LoginPage.login_button(driver).click();


    }

}
