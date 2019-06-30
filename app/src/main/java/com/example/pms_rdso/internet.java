package com.example.pms_rdso;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class internet {
    String start()
    {
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
        WebDriver driver = new HtmlUnitDriver();
        driver.get("https://www.stackoverflow.com");
        // WebElement element = driver.findElement(By.name("q"));
        //element.sendKeys("stackoverflow");
        //element.submit();
        //driver.findElement(By.linkText("https://stackoverflow.com/")).click();
        String Title = driver.getTitle();
        return ("I am at " +Title);
    }
}