package com.selenide.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class InitTest {

    static WebDriver driver;

    @BeforeSuite	public void setUpSuite() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        
        driver = new ChromeDriver();
    }


    















}//end class