package com.cybertek.tests.day5_xpath;

import com.cybertek.tests._utilities.WebDriveFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonTest {

    /**
     * navigate to amazon.com
     * type selenium in the searchbox
     * click search button
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriveFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        //locate searchbox
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        //type selenium
        searchBox.sendKeys("Selenium");

        Thread.sleep(1000);
        //locate searchButton
        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));

        searchButton.click();


    }
}
