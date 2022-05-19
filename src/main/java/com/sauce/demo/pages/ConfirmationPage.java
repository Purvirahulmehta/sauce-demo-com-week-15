package com.sauce.demo.pages;

import com.sauce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends Utility {
    private static final Logger log = LogManager.getLogger(ConfirmationPage.class.getName());

    public ConfirmationPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement thankYouMessage;

    public String thankYouForYourOrderMessage(){
        log.info("Get Message: " + thankYouMessage.toString());
        return getTextFromElement(thankYouMessage);

    }
}
