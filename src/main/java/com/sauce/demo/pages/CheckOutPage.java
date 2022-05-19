package com.sauce.demo.pages;

import com.sauce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continuTab;
    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishTab;


    public void enterFirstName(String name){
        sendTextToElement(firstName,name);
        log.info("Enter First Name: " + firstName.toString());
    }
    public  void enterLastName(String name){
        sendTextToElement(lastName,name);
        log.info("Enter Last Name: " + lastName.toString());
    }
    public  void enterPstCode(String code){
        sendTextToElement(postCode,code);
        log.info("Enter Post Code: " + postCode.toString());
    }
    public void clickOnContinuTab(){
        clickOnElement(continuTab);
        log.info("Click on Continue Tab: " + continuTab.toString());
    }
    public void clickOnFinishTab(){
        clickOnElement(finishTab);
        log.info("Click on Finish Tab: " + finishTab.toString());
    }



}
