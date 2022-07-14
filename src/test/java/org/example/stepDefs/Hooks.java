package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver =null;
    @Before
    public static void openBrowser()
    {
        //define bridge
        String chromedriver=System.setProperty("webdriver.chrome.driver","C:\\Users\\salma\\IdeaProjects\\demonopcommerce\\src\\main\\resources\\chromedriver.exe");


        // Create new object from chromedriver
        driver=new ChromeDriver();

        //configuration
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //navigate to website
        driver.navigate().to("https://demo.nopcommerce.com/");


    }

    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
