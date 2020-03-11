package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;


public class NavigationTests {
    public static void main(String[] args) throws InterruptedException {
        testWithChrome();
        Thread.sleep(2000);
        testWithFirefox();
        Thread.sleep(2000);
        testWithEdge();

}

        public static void testWithChrome () {

            WebDriver driver = BrowserFactory.getDriver("chrome");

            driver.get("https://google.com");

            String actualTitleOfGoogle = driver.getTitle();

            driver.navigate().to("https://etsy.com");

            String actualTitleOfEtsy = driver.getTitle();

            driver.navigate().back();

            System.out.print("Previous and current title of Google page test : ");

            StringUtility.verifyEquals(actualTitleOfGoogle, driver.getTitle());

            driver.navigate().forward();

            System.out.print("Previous and current title of Etsy page test   : ");

            StringUtility.verifyEquals(actualTitleOfEtsy, driver.getTitle());

            driver.quit();

        }

        public static void testWithFirefox () {

            WebDriver driver = BrowserFactory.getDriver("firefox");

            driver.get("https://google.com");

            String actualTitleOfGoogle = driver.getTitle();

            driver.navigate().to("https://etsy.com");

            String actualTitleOfEtsy = driver.getTitle();

            driver.navigate().back();

            System.out.print("Previous and current title of Google page test : ");

            StringUtility.verifyEquals(actualTitleOfGoogle, driver.getTitle());

            driver.navigate().forward();

            System.out.print("Previous and current title of Etsy page test   : ");

            StringUtility.verifyEquals(actualTitleOfEtsy, driver.getTitle());

            driver.quit();

        }

        public static void testWithEdge () {

            WebDriver driver = BrowserFactory.getDriver("ED");

            driver.get("https://google.com");

            String actualTitleOfGoogle = driver.getTitle();

            driver.navigate().to("https://etsy.com");

            String actualTitleOfEtsy = driver.getTitle();

            driver.navigate().back();

            System.out.print("Previous and current title of Google page test : ");

            StringUtility.verifyEquals(actualTitleOfGoogle, driver.getTitle());

            driver.navigate().forward();

            System.out.print("Previous and current title of Etsy page test   : ");

            StringUtility.verifyEquals(actualTitleOfEtsy, driver.getTitle());

            driver.quit();

        }

    }


