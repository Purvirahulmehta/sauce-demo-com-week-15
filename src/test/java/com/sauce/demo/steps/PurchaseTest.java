package com.sauce.demo.steps;

import com.sauce.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PurchaseTest {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password)  {
        new HomePage().enterUserName(username);
        new HomePage().enterPassWord(password);

    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginButton();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String menu)  {
        new ProductPage().selectFromDropDownManu(menu);

    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new ProductPage().clickOnCheapestProduct();
        new ProductPage().clickOnCostliestProduct();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new ProductPage().clickOnShoppingCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new ShoppingCartPage().clickOnCheckOut();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstname, String lastname, String zipcode)  {
        new CheckOutPage().enterFirstName(firstname);
        new CheckOutPage().enterLastName(lastname);
        new CheckOutPage().enterPstCode(zipcode);

    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnContinuTab();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutPage().clickOnFinishTab();
    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
        Assert.assertEquals("Page not found","THANK YOU FOR YOUR ORDER",new ConfirmationPage().thankYouForYourOrderMessage());
    }
}
