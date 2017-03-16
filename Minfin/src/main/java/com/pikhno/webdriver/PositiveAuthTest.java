package com.pikhno.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PositiveAuthTest {

    @Test
    public void startWebDriver (){
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://minfin.com.ua");
        driver.findElement(By.className("mfm-auth--ddown-handle")).click();
        driver.findElement(By.name("Login")).sendKeys("pikhnooo");
        driver.findElement(By.name("Password")).sendKeys("aPril");
        driver.findElement(By.className("mfm-auth--submit-btn")).click();

        //driver.close();
        driver.quit();
    }


}
