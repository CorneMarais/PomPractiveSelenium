package Positive;

import Pages.Checkout;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.ShoppingCart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class LoginTest {


    public static WebDriver driver;

    public static long sleepDurationBetweenSteps = 1000;

    public static void main(String[] args) throws InterruptedException {

        test_setup();
        add_items();
        open_cart();
        checkout();
        checkout_your_information();
        tear_down();

    }

        @BeforeTest
        public static void test_setup ()  {


            System.setProperty("webdriver.chrome.driver", "C:/Users//Corne//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().fullscreen();


    }

        @Test(priority = 1)
        public static void login () throws InterruptedException {

            Thread.sleep(sleepDurationBetweenSteps);
            LoginPage.username(driver).sendKeys("standard_user");
            Thread.sleep(sleepDurationBetweenSteps);
            LoginPage.password(driver).sendKeys("secret_sauce");
            Thread.sleep(sleepDurationBetweenSteps);
            LoginPage.login_button(driver).click();
            Thread.sleep(sleepDurationBetweenSteps);
        }

        @Test(priority = 2)
        public static void add_items () throws InterruptedException {

            Thread.sleep(sleepDurationBetweenSteps);
            LandingPage.add_to_cart_Bike(driver).click();
            Thread.sleep(sleepDurationBetweenSteps);
            LandingPage.add_to_cart_Backpack(driver).click();
            Thread.sleep(sleepDurationBetweenSteps);
        }

        @Test(priority = 3)
        public static void open_cart () throws InterruptedException {

            Thread.sleep(sleepDurationBetweenSteps);
            LandingPage.cart_button(driver).click();
            Thread.sleep(sleepDurationBetweenSteps);
        }

        @Test(priority = 4)
        public static void checkout () throws InterruptedException {

            Thread.sleep(sleepDurationBetweenSteps);
            ShoppingCart.checkout_bt(driver).click();
            Thread.sleep(sleepDurationBetweenSteps);
        }

        @Test(priority = 5)
        public static void checkout_your_information () throws InterruptedException {

            Thread.sleep(sleepDurationBetweenSteps);
            Checkout.first_name(driver).sendKeys("Kaylin");
            Thread.sleep(sleepDurationBetweenSteps);
            Checkout.last_name(driver).sendKeys("Ruhrmund");
            Thread.sleep(sleepDurationBetweenSteps);
            Checkout.zip_code(driver).sendKeys("7441");
            Thread.sleep(sleepDurationBetweenSteps);
            Checkout.Continue_1(driver).click();
            Thread.sleep(sleepDurationBetweenSteps);
        }


        @AfterTest
        public static void tear_down() {

            driver.quit();
        }

    }
