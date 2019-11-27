package com.selenide.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.*;

public class MainTest{

   
public static void main(String[] args) throws InterruptedException {
    
   

    open("http://minor.enetelsolutions.com/rest/public/admin/login");

    $("input[type='email']").setValue("backofficesupport@enetelsolutions.com");
    $("input[type='password']").setValue("Ntl4dm1np4ss#2019");
    $(".btn.btn-primary").shouldBe(visible).click();

    $(By.xpath("//*[@class='ng-tns-c3-1' and text()='Catalog']")).shouldBe(visible).click();
    $(By.xpath("//*[@class='ng-tns-c3-3' and text()='Products']")).shouldBe(visible).click();

    $("a[href='#/products']").shouldBe(visible).click();
    

    Thread.sleep(5000);

    //
    //body > app-root > div > div > div.layout-menu > div > div.nano-content.menu-scroll-content > app-menu > ul > li:nth-child(3) > a
    //NgWebDriver ngWebDriver = new NgWebDriver(driver);
    //ngWebDriver.waitForAngularRequestsToFinish();

    // $("#modal-cookie-info .cookie-agree").should(visible).click();
    // $(".mc-user").shouldBe(visible).click();
    // $("#loginEmail").setValue("vladimir.radan@enetelsolutions.com");
    // $("#loginPassword").setValue("Vladavr6!");
    // $("input[value='Ulogujte se']").shouldBe(visible).click();
    //Ntl4dm1np4ss#2019
    //backofficesupport@enetelsolutions.com






}//end main


}