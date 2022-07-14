package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D06_homeSlidersStepDef {

    P03_homePage home=new P03_homePage();


    @When("user click on first slider")
    public void choosefirstslider() throws InterruptedException {
     home.slider("1").click();
     Thread.sleep(2000);
    }

    @Then("relative product of first slider should be displayed")
    public void first_slider_is_displayed() throws InterruptedException {

        Thread.sleep(2000);
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"),"The first slider is clickable but iphone product is not displayed");
        soft.assertAll();
    }

    @When("user click on second slider")
    public void choosesecondslider() throws InterruptedException {
        home.slider("2").click();
        Thread.sleep(2000);
    }

    @Then("relative product of second slider should be displayed")
    public void second_slider_is_displayed() throws InterruptedException {

        Thread.sleep(2000);
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"),"The second slider is clickable but Nokia product is not displayed");
        soft.assertAll();
    }
}
