package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D03_currenciesStepDef {
    P03_homePage home= new P03_homePage();

    @When("user changes the currency to euro")
    public void change_toeuro()
    {
        home.select_currency().selectByVisibleText("Euro");

    }

@Then("Euro Symbol \"(.*)\" is shown on the 4 products displayed in Home page$")
    public void eurosymbol_isdisplayed(String eurosymbol) throws InterruptedException {
    //String[] price= new String[4];
        SoftAssert soft=new SoftAssert();
        int count=home.listcurrency().size();
        for(int i=0; i<count; i++) {

            String price=home.listcurrency().get(i).getText();
            soft.assertTrue(price.contains(eurosymbol));
            Thread.sleep(1000);
            soft.assertAll();

        }


    }

}
