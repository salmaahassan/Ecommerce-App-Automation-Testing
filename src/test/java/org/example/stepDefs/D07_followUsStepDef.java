package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homePage home=new P03_homePage();

    @When("user clicks on facebook logo")
    public void useropensfacebooklink() throws InterruptedException {
        home.fblink().click();
        Thread.sleep(2000);

    }

    @When("user click on youtube logo")
    public void useropensyoutubelink() throws InterruptedException {
        home.youtubelink().click();
        Thread.sleep(2000);

    }

    @When("user click on rss logo")
    public void useropensrsslink() throws InterruptedException {
        home.rsslink().click();
        Thread.sleep(2000);

    }



    @When("user click on twitter logo")

    public void useropenstwitterlink() throws InterruptedException {
        home.twitterlink().click();
        Thread.sleep(2000);

    }


    @Then("^\"(.*)\" is opened in new tab$")
    public void linkisopened(String url) throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert soft = new SoftAssert();
        ArrayList tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        int size=tabs.size();
        if(size>1) {
            Hooks.driver.switchTo().window((String) tabs.get(1));
            soft.assertEquals(Hooks.driver.getCurrentUrl(), url);
            Hooks.driver.close();
            Hooks.driver.switchTo().window((String) tabs.get(0));
            System.out.println(Hooks.driver.getCurrentUrl());
            System.out.println(Hooks.driver.getTitle());
        }
        else if(size==1)
        {
            soft.assertEquals(Hooks.driver.getCurrentUrl(), url);
            System.out.println(url);
            System.out.println(Hooks.driver.getCurrentUrl());
        }
        soft.assertAll();




    }
}
