package com.selenide.test;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.WebDriver;

public class PomKlasa extends PageObject {

    public PomKlasa(WebDriver driver) {
        super(driver);
    }


    SelenideElement icon = $(".mc-user");
    SelenideElement email = $("#loginEmail");
    SelenideElement pass = $("#loginPassword");
    SelenideElement button = $("btn.btn-fill");

    public void loginUser(){
        icon.shouldBe(visible).click();
        email.setValue("vladimir.radan@enetelsolutions.com");
        pass.setValue("Vladavr6!");
        button.shouldBe(visible).click();
    }

    
}//end class