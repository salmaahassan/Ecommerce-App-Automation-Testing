package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_login {
    JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
    public WebElement login_navigation()
    {
        WebElement Login=Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
        return Login;
    }

    public WebElement login_username()
    {
        WebElement username=Hooks.driver.findElement(By.id("Email"));
        js.executeScript("arguments[0].scrollIntoView();", username);
        return username;
    }
    public WebElement login_password()
    {
        WebElement password=Hooks.driver.findElement(By.id("Password"));
        js.executeScript("arguments[0].scrollIntoView();", password);
        return password;
    }

    public WebElement getfailmsg()
    {
        WebElement failmsg=Hooks.driver.findElement(By.className("message-error"));
        js.executeScript("arguments[0].scrollIntoView();", failmsg);
        return failmsg;

    }

    public WebElement loginbtn()
    {
        WebElement login_button=Hooks.driver.findElement(By.className("login-button"));
        js.executeScript("arguments[0].scrollIntoView();", login_button);
        return login_button;
    }

    public WebElement myaccountfield()
    {
        WebElement myaccfield=Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
        return myaccfield;
    }






}
