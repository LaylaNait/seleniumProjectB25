package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

      //1-set up the  "browser driver"
        WebDriverManager.chromedriver().setup();
     //2-create instance of the selenium WebDriver
     //this is the line opening an empty browser
        WebDriver driver = new ChromeDriver();
      // this line will maximaze the browser size
      driver .manage().window().maximize();
       // driver .manage().window().fullscreen();

        //3-Go to "https://www.tesla.com"
     driver.get("https://www.tesla.com");

       String currentTitle = driver.getTitle();
        System.out.println("currentTitle = "+ currentTitle );
        String currentURL =  driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

     // stop code execution for 3 seconds
     Thread.sleep(3000);

     // use selenium to navigate back
     driver.navigate().back();

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate forward
      driver.navigate().forward();

        // use selenium to navigate refresh
        driver.navigate().refresh();

       // use navigate().to():
       driver.navigate().to("https://www.google.com");
        // get the current title after getting the google page
         currentTitle = driver.getTitle();


       // get the title of the page

        System.out.println("currentTitle = "+ currentTitle );

        // get the current URL using selenium
          currentURL = driver .getCurrentUrl();
        System.out.println("currentURL = "+ currentURL);

            driver.quit(); // this will close the current session
            driver.close(); // this will close all of the opened windows


    }
}
