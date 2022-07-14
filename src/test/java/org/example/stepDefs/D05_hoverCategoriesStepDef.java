package org.example.stepDefs;
import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;


public class D05_hoverCategoriesStepDef {

    P03_homePage home = new P03_homePage();



    @When("user select one of the three main categories")
    public void main_category_is_selected() throws InterruptedException {
        String s1;
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(home.element_categories()).perform();
        Thread.sleep(2000);
        s1=home.element_categories().getText();
        System.out.println(s1);
        actions.moveToElement(home.element_subcategories()).perform();
        Thread.sleep(2000);
        String subcategoryname=home.element_subcategories().getText();
        System.out.println(subcategoryname);
        home.element_subcategories().click();
        String subcategorytitle=Hooks.driver.getTitle();
        System.out.println(subcategorytitle);
        SoftAssert soft=new SoftAssert();
        String url=Hooks.driver.getCurrentUrl();
        System.out.println(url);

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(subcategoryname.toLowerCase().trim()));
        soft.assertEquals(home.element_name().getText(),subcategoryname);
        System.out.println(home.element_name().getText());
        soft.assertAll();





    }




}
