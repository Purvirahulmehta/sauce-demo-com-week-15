package com.sauce.demo.pages;

import com.sauce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log= LogManager.getLogger(ShoppingCartPage.class.getName());
    public ShoppingCartPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath ="//button[@id='checkout']")
    WebElement checkOutTab;
    public void clickOnCheckOut(){
        clickOnElement(checkOutTab);
    }
}
