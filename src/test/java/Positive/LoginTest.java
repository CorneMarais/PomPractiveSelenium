package Positive;

import Pages.LandingPage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    public static WebDriver driver = null;

    public static void main(String[] args) {

        test_setup();
        login();
        add_items();

    }

    @BeforeTest
    public static void test_setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }



    @Test(priority = 1)
    public static void login(){

        LoginPage.username(driver).sendKeys("standard_user");
        LoginPage.password(driver).sendKeys("secret_sauce");;
        LoginPage.login_button(driver).click();
    }

    @Test(priority = 2)
    public static void add_items(){

        LandingPage.add_to_cart_Bike(driver).click();
        LandingPage.add_to_cart_Backpack(driver).click();
    }


}
