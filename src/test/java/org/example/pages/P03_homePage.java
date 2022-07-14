package org.example.pages;

import io.cucumber.java.eo.Se;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {
    JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;

    public Select select_currency()
    {
        WebElement currencyselect= Hooks.driver.findElement(By.id("customerCurrency"));
        js.executeScript("arguments[0].scrollIntoView();", currencyselect);
        Select select=new Select(currencyselect);

        return select;
    }

    public List<WebElement> listcurrency()
    {
        List<WebElement> elementlist=Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
         js.executeScript("scroll(0,1200);");
        return elementlist;

    }

    public WebElement search_field()
    {
        WebElement search=Hooks.driver.findElement(By.id("small-searchterms"));
        js.executeScript("arguments[0].scrollIntoView();", search);
        return search;
    }

    public WebElement searchBtn()
    {
        WebElement searchBTN=Hooks.driver.findElement(By.className("search-box-button"));
        return searchBTN;
    }

    public List<WebElement> countofproducts()
    {
        List<WebElement> searchedelements=Hooks.driver.findElements(By.className("product-title"));
        js.executeScript("scroll(0,900);");
        return searchedelements;
    }

    public WebElement product_image()
    {
        WebElement image=Hooks.driver.findElement(By.cssSelector("div[class=\"picture\"]"));
        js.executeScript("arguments[0].scrollIntoView();", image);
        return image;
    }
    public WebElement sku_element()
    {
        WebElement sku=Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]"));
        js.executeScript("arguments[0].scrollIntoView();", sku);
        return sku;

    }

    public WebElement slider(String slidernumber)
    {
        WebElement slider=Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+slidernumber+"]"));
        js.executeScript("scroll(0,1300);");
        return slider;
    }

    public WebElement fblink() throws InterruptedException {
        WebElement fb=Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
        js.executeScript("arguments[0].scrollIntoView();", fb);
        Thread.sleep(2000);
        return fb;

    }

    public WebElement twitterlink() throws InterruptedException {
        WebElement twitter=Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
        js.executeScript("arguments[0].scrollIntoView();", twitter);
        Thread.sleep(2000);
        return twitter;

    }

    public WebElement youtubelink() throws InterruptedException {
        WebElement youtube=Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
        js.executeScript("arguments[0].scrollIntoView();", youtube);
        Thread.sleep(2000);
        return youtube;

    }

    public WebElement rsslink() throws InterruptedException {
        WebElement rss=Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
        js.executeScript("arguments[0].scrollIntoView();", rss);
        Thread.sleep(2000);
        return rss;

    }


    public WebElement element_categories()
    {
        WebElement category=Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
        js.executeScript("arguments[0].scrollIntoView();", category);
        return category;
    }

    public WebElement element_subcategories()
    {
        WebElement subcategory=Hooks.driver.findElement(By.cssSelector("a[href=\"/notebooks\"]"));
        //js.executeScript("arguments[0].scrollIntoView();", subcategory);
        return subcategory;
    }



    public WebElement element_name()
    {
        WebElement name=Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
        js.executeScript("arguments[0].scrollIntoView();", name);
        return name;
    }

    public WebElement wishlistBTN() throws InterruptedException {
        WebElement wishlistbtn=Hooks.driver.findElements(By.className("add-to-wishlist-button")).get(2);
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView();", wishlistbtn);
        return wishlistbtn;
    }

    public WebElement notificationmsg_wishlist()
    {
        WebElement wishlist_msg=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
        js.executeScript("arguments[0].scrollIntoView();", wishlist_msg);
        return wishlist_msg;
    }

    public WebElement wishlist_tab()
    {
        WebElement wishlist_tab=Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
        js.executeScript("arguments[0].scrollIntoView();", wishlist_tab);
        return wishlist_tab;
    }

    public WebElement getvalue()
    {
        WebElement value=Hooks.driver.findElement(By.className("qty-input"));
        js.executeScript("arguments[0].scrollIntoView();", value);
        return value;
    }

}
