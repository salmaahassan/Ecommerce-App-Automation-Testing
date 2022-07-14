package org.example.pages;

import io.cucumber.java.eo.Se;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {

    JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;

    public WebElement registerBtn()
    {
        WebElement registerBtn= Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
        return registerBtn;
    }

    public WebElement gender_select_male()
    {
        WebElement gender_is_male=Hooks.driver.findElement(By.id("gender-male"));
        js.executeScript("arguments[0].scrollIntoView();", gender_is_male);
        return gender_is_male;
    }

    public WebElement gender_select_female()
    {
        WebElement gender_is_female=Hooks.driver.findElement(By.id("gender-female"));
        js.executeScript("arguments[0].scrollIntoView();", gender_is_female);
        return gender_is_female;
    }

    public WebElement fill_Firstname()
    {

        WebElement firstname= Hooks.driver.findElement(By.id("FirstName"));
        js.executeScript("arguments[0].scrollIntoView();", firstname);
         return firstname;
    }
    public WebElement fill_Lastname()
    {
        WebElement lastname= Hooks.driver.findElement(By.id("LastName"));
        js.executeScript("arguments[0].scrollIntoView();", lastname);
        return lastname;
    }



    public Select day()
    {
        WebElement dayofbirth=Hooks.driver.findElement(By.name("DateOfBirthDay"));
        js.executeScript("arguments[0].scrollIntoView();", dayofbirth);
        Select Day=new Select(dayofbirth);
        return Day;

    }
    public Select month()
    {
        WebElement monthofbirth=Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        js.executeScript("arguments[0].scrollIntoView();", monthofbirth);
        Select Month=new Select(monthofbirth);
        return Month;

    }
    public Select year()
    {
        WebElement yearofbirth=Hooks.driver.findElement(By.name("DateOfBirthYear"));
        js.executeScript("arguments[0].scrollIntoView();", yearofbirth);
        Select Year=new Select(yearofbirth);
        return Year;
    }


    public WebElement fill_email()
    {
        WebElement email= Hooks.driver.findElement(By.id("Email"));
        js.executeScript("arguments[0].scrollIntoView();", email);
        return email;
    }

    public WebElement fill_password()
    {
        WebElement password= Hooks.driver.findElement(By.id("Password"));
        js.executeScript("arguments[0].scrollIntoView();", password);
        return password;
    }

    public WebElement fill_password_confirmation()
    {
        WebElement password_confirmation= Hooks.driver.findElement(By.id("ConfirmPassword"));
        return password_confirmation;
    }

    public WebElement registerbutton()
    {
        WebElement registerbuttonid= Hooks.driver.findElement(By.id("register-button"));
        return registerbuttonid;
    }

    public WebElement gettextarea()
    {
        WebElement textarea=Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
        return textarea;
    }




}
