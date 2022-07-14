package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.scene.layout.Background;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D08_WishlistStepDef {

    P03_homePage home=new P03_homePage();

    @When("user click on wishlist button on this product HTC One M8 Android L 5.0 Lollipop")
    public void user_click_on_wishlistBtn() throws InterruptedException {

        home.wishlistBTN().click();
        Thread.sleep(2000);

    }

    @Then("success message with green color is displayed")
    public void success_displayed_msg()
    {
        SoftAssert soft=new SoftAssert();
        String actualmsg= home.notificationmsg_wishlist().getText();
        String expectedsuccessmsg="The product has been added to your wishlist";
        System.out.println(actualmsg);
        soft.assertTrue(actualmsg.contains(expectedsuccessmsg), "Item is not added to wishlist");
        String msg_backgroudcolor=home.notificationmsg_wishlist().getCssValue("background-color");
        //Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(msg_backgroudcolor);
        Color color=null;
        String expected_color_inHex="#4bb07a";
        String actual_color_in_hex = color.fromString(msg_backgroudcolor).asHex();
        System.out.println(actual_color_in_hex);
        soft.assertEquals(actual_color_in_hex,expected_color_inHex);
        soft.assertAll();

    }
    @And("user waits until success message becomes invisible after that he clicks on Wishlist tab")
        public void click_on_wishlisttab() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("span[title=\"Close\"]")).click();
        Thread.sleep(2000);
        home.wishlist_tab().click();
        Thread.sleep(2000);
        String value=home.getvalue().getAttribute("value");
        System.out.println(value);
        int QTY= Integer.parseInt(value);
        System.out.println(QTY);
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(QTY>0);



        // explicit wait (Not working with me)
        //WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofMinutes(1));
        //wait.until(ExpectedConditions.invisibilityOf(home.notificationmsg_wishlist()));
        //home.wishlist_tab().click();

        }

}
