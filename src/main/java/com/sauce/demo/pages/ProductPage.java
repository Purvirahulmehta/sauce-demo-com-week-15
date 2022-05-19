package com.sauce.demo.pages;

import com.sauce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    private static final Logger log= LogManager.getLogger(ProductPage.class.getName());
    public ProductPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath =  "//select[@class='product_sort_container']")

    WebElement sortByDropDown;
    @CacheLookup
    @FindBy(xpath ="//div[@class='inventory_list']/div[1]/div/div/button")
    WebElement costliestProduct;
    @CacheLookup
    @FindBy(xpath ="//div[@class='inventory_list']/div[6]/div/div/button")
    WebElement cheapestProduct;
    @CacheLookup
    @FindBy(xpath ="//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    WebElement shoppingCartButton;

public void selectFromDropDownManu(String manu){
    selectByVisibleTextFromDropDown(sortByDropDown,manu);
    log.info("Select FROM Drop Down: " + sortByDropDown.toString());
    }
    public void clickOnCostliestProduct(){
    clickOnElement(costliestProduct);
    log.info("Click on Costliest Product: " + costliestProduct.toString());
    }
    public void clickOnCheapestProduct(){
        clickOnElement(cheapestProduct);
        log.info("Click on Cheapest Product: " + cheapestProduct.toString());
    }
    public void clickOnShoppingCart(){
    clickOnElement(shoppingCartButton);
    log.info("Click on Shopping Cart: " + shoppingCartButton.toString());
    }

}

