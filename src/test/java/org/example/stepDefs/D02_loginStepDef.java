package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login=new P02_login();

    @Given("user go to login page")
    public void go_loginpage() throws InterruptedException {
        login.login_navigation().click();
        Thread.sleep(2000);
    }

    @When("user login with valid \"(.*)\" and \"(.*)\"$")
    public void valid_data(String username, String password) throws InterruptedException {
        login.login_username().sendKeys(username);
        Thread.sleep(2000);
        login.login_password().sendKeys(password);
        Thread.sleep(2000);
    }

    @When("user login with invalid \"(.*)\" and \"(.*)\"$")
    public void invalid_data(String username, String password) throws InterruptedException {
        login.login_username().sendKeys(username);
        Thread.sleep(2000);
        login.login_password().sendKeys(password);
        Thread.sleep(2000);

    }

    @And("user press on login button")
    public void press_login() throws InterruptedException {

        login.loginbtn().click();
        Thread.sleep(2000);
    }

    @Then("user could login to the system")
    public void success_login() throws InterruptedException {
        String actualurl=Hooks.driver.getCurrentUrl();
        String expectedurl="https://demo.nopcommerce.com/";
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(actualurl.contains(expectedurl));
        soft.assertTrue(login.myaccountfield().isDisplayed());
        soft.assertAll();
        Thread.sleep(2000);
    }

    @Then("user could not login to the system")
    public void failed_login() throws InterruptedException {
        String expected_failmsg="Login was unsuccessful.";
        String actual_msg= login.getfailmsg().getText();
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(actual_msg.contains(expected_failmsg));
        String color=login.getfailmsg().getCssValue("color");
        String expected_color_inHex="#e4434b";
        Color color1=null;
        String actual_color_in_hex = color1.fromString(color).asHex();
        soft.assertEquals(actual_color_in_hex,expected_color_inHex);
        System.out.println(actual_color_in_hex);

        soft.assertAll();
        Thread.sleep(2000);
    }
}
