package Positive;

import Pages.Checkout;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.ShoppingCart;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginTest {


    public static WebDriver driver = null;


    public static void main(String[] args)  {

        test_setup();
        login();
        add_items();
        open_cart();
        tear_down();

    }

    @BeforeTest
    public static void test_setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }



    @Test(priority = 1)
    public static void login(){


        LoginPage.username(driver).sendKeys("standard_user");
        LoginPage.password(driver).sendKeys("secret_sauce");
        LoginPage.login_button(driver).click();
    }

    @Test(priority = 2)
    public static void add_items(){

        LandingPage.add_to_cart_Bike(driver).click();
        LandingPage.add_to_cart_Backpack(driver).click();
    }

    @Test(priority = 3)
    public static void open_cart(){

        LandingPage.cart_button(driver).click();
    }

    @Test(priority = 4)
    public static void checkout(){

        ShoppingCart.checkout_bt(driver).click();
    }

    @Test(priority = 5)
    public static void checkout_your_information(){

        Checkout.first_name(driver).sendKeys("Kaylin");
        Checkout.last_name(driver).sendKeys("Ruhrmund");
        Checkout.zip_code(driver).sendKeys("7441");
        Checkout.Continue_1(driver).click();
    }

    @AfterTest
   public static void tear_down(){

        driver.quit();
    }

}
