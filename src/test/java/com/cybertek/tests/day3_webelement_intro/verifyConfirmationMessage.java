package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.tests._utilities.WebDriveFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {


    public static void main(String[] args) throws InterruptedException {
/**open browser
 go to http://practice.cybertekschool.com/forgot_passwordHarici bir siteye bağlantılar.
 enter any email
 verify that email is displayed in the input box
 click on Retrieve password
 verify that confirmation message says 'Your e-mail's been sent!'
 */
//open browser
        WebDriver driver = WebDriveFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputbox = driver.findElement(By.name("email"));

        String expectedEmail = "test@gmail.com";

        emailInputbox.sendKeys(expectedEmail);
        String actualEmail = emailInputbox.getAttribute("value");

        if (expectedEmail.equals(actualEmail)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedEmail = " + expectedEmail);
            System.out.println("actualEmail = " + actualEmail);
        }

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String expectedMessage = "Your e_mail is been sent";

        WebElement messageElement = driver.findElement(By.name("confirmation message"));
        String actualMessage = messageElement.getText();
        System.out.println(actualMessage);
        if (expectedMessage.equals(actualMessage)) {
            System.out.println(" PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }
        Thread.sleep(3000);
        //close the browser
        driver.quit();
        //close the browser
        driver.quit();
    }
}