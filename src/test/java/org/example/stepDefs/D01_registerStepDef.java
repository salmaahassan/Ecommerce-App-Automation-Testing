package org.example.stepDefs;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef {

    P01_register reg=new P01_register();

@Given("user go to register page")
    public void go_to_register()
    {
        System.out.println("This is a test before start coding");

        reg.registerBtn().click();
    }

@When("^user select gender type \"(.*)\"$")
    public void select_Gender(String gender) throws InterruptedException {
        if(gender.equalsIgnoreCase("Male")) {
            reg.gender_select_male().click();
            Thread.sleep(2000);

        } else if (gender.equalsIgnoreCase("female")) {

            reg.gender_select_male().click();
            Thread.sleep(2000);
        }


    }

@And("user enter first name \"(.*)\" and last name \"(.*)\"$")
   public void enter_first_last_name(String firstname, String lastname) throws InterruptedException {

    reg.fill_Firstname().sendKeys(firstname);
    Thread.sleep(2000);
    reg.fill_Lastname().sendKeys(lastname);
    Thread.sleep(2000);

    }

@And("user enter date of birth \"(.*)\"/\"(.*)\"/\"(.*)\"$")
    public void enter_DOB(String day,String month, String year) throws InterruptedException {


    reg.day().selectByValue(day);
    reg.month().selectByValue(month);
    reg.year().selectByValue(year);
    Thread.sleep(2000);


}




@And("user enter email \"(.*)\" field$")
    public void enter_email(String email) throws InterruptedException {
    reg.fill_email().sendKeys(email);
    Thread.sleep(2000);
}

@And("user fills Password fields \"(.*)\" \"(.*)\"$")
    public void enter_password(String password, String confirmedpassword) throws InterruptedException {


    reg.fill_password().sendKeys(password);
    Thread.sleep(2000);
    reg.fill_password_confirmation().sendKeys(confirmedpassword);
    Thread.sleep(2000);
}

@And("user clicks on register button")
    public void click_register()
    {
        reg.registerbutton().click();
    }

@Then("success message is displayed")
    public void user_register_success()
    {
    SoftAssert soft=new SoftAssert();
    String expected_result="Your registration completed";
    String actual_result=reg.gettextarea().getText();
    soft.assertTrue(actual_result.contains(expected_result));
    String color=reg.gettextarea().getCssValue("color");
    String expectedcolor="rgba(76, 177, 124, 1)";
    soft.assertEquals(color,expectedcolor);
    soft.assertAll();
    System.out.println("Color is :"+color);


    }


}
