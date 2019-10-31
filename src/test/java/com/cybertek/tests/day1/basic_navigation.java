package com.cybertek.tests.day1;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_navigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //creating
        WebDriver driver = new ChromeDriver();
        //open browser
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());

    }
}
