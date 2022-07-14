package org.example.stepDefs;



import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class D04_searchStepDef {

    P03_homePage home=new P03_homePage();

    @When("user enters \"(.*)\" in the search field$")
    public void user_search_for(String product) throws InterruptedException {
        home.search_field().sendKeys(product);
        Thread.sleep(2000);

    }

    @And("user enters search button")
    public void enters_searchBtn() throws InterruptedException {
        home.searchBtn().click();
        Thread.sleep(2000);
    }

    @Then("user should be directed to another url")
    public void search_url_check()
    {
        String actual_url=Hooks.driver.getCurrentUrl();
        String expected_url="https://demo.nopcommerce.com/search?q=";
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(actual_url.contains(expected_url));
        soft.assertAll();

    }

    @And("user could find relative results for \"(.*)\"$")
    public void count_searchresults(String product) {
        SoftAssert soft = new SoftAssert();
        int count = home.countofproducts().size();
        soft.assertTrue(count > 0);
        ArrayList<String> appeared_product = new ArrayList<>();
        System.out.println(count);

        for (int i = 0; i < count; i++) {
            String text = home.countofproducts().get(i).getText().toLowerCase();
            System.out.println(text);
            soft.assertTrue(text.contains(product));
            System.out.println(product);

            soft.assertAll();

        }
    }

    @And("user clicks on the product in search result")
    public void clicks_on_sku() throws InterruptedException {
            home.product_image().click();
            Thread.sleep(2000);

        }

@Then("\"(.*)\" is displayed$")
    public void assert_sku(String sku)
{
    String actual_sku=home.sku_element().getText();
    System.out.println(actual_sku);
    System.out.println(sku);
    Assert.assertTrue(actual_sku.contains(sku));

}

}
