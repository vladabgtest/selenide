package com.selenide.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.*;

public class TestnaKlasa extends InitTest {

    PomKlasa test;
    String url = "http://metalac.enetelsolutions.com";

    @BeforeTest
    public void instantiateClasses() {
        test = new PomKlasa(driver);
    }
    
    @Test
    public void login(){
    open(url);
    driver.manage().window().maximize();
    $(".mc-user").shouldBe(visible).click();
    $("#loginEmail").setValue("vladimir.radan@enetelsolutions.com");
    $("#loginPassword").setValue("Vladavr6!");
    $("btn.btn-fill").shouldBe(visible).click();
    }



}