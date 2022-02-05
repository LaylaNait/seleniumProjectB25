package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_CydeoVerifucation {
    public static void main(String[] args) {

       // TC #1: Cydeo practice tool verifications
       // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
       // 2. Go to https://practice.cydeo.com
       driver.navigate().to("https://practice.cydeo.com");
       // 3. Verify URL contains
       // Expected: cydeo
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "cydeo";

        if (currentUrl.equals(expectedUrl)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
       // 4. Verify title:
       // Expected: Practice
        String expectedTitle ="Practice";
       String actualTitle = driver.getTitle();
       if (actualTitle.equals(expectedTitle)){
           System.out.println("Title verification Passed");
       }else {
           System.out.println("Title verification Failed");
       }
      driver.close();




    }
}
