package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.tests._utilities.WebDriveFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) {
        WebDriver driver = WebDriveFactory.getDriver("firefox");
        driver.get("http://www.google.com");
    }
}
