package com.sauce.demo.pages;

import com.sauce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath ="//input[@id='user-name']")
    WebElement userName;
    @CacheLookup
    @FindBy(xpath ="//input[@id='password']")
    WebElement passWord;
    @CacheLookup
    @FindBy(xpath ="//input[@id='login-button']")
    WebElement loginButton;

    public void enterUserName(String username){
        sendTextToElement(userName,username);
        log.info("Enter Username: " + userName.toString());
    }
    public void enterPassWord(String password){
        sendTextToElement(passWord,password);
        log.info("Enter PassWord: " + passWord.toString());

    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Click on Login Button: " + loginButton.toString());
    }

}
