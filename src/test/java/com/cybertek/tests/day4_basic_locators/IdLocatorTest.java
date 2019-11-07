package com.cybertek.tests.day4_basic_locators;

import com.cybertek.tests._utilities.WebDriveFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {

    public static void main(String[] args) {
        WebDriver driver = WebDriveFactory.getDriver("chrome");
driver.manage().window().maximize();
driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));
        dontClickButton.click();
        driver.quit();
    }
}
