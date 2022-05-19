$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17094809300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User navigates saucedemo page and complete the item purchase",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchase",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I filter the products by Price \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter details firstname \"Pooja\", lastName \"Shah\" and zipPostalCode \"364001\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see message \u0027Thank you for your order\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseTest.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 404100200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "PurchaseTest.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 1949439900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnLoginButton()"
});
formatter.result({
  "duration": 724696200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "PurchaseTest.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 581053100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 371111700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iOpenShoppingCart()"
});
formatter.result({
  "duration": 465471300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iGoToCheckout()"
});
formatter.result({
  "duration": 398239900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pooja",
      "offset": 27
    },
    {
      "val": "Shah",
      "offset": 45
    },
    {
      "val": "364001",
      "offset": 70
    }
  ],
  "location": "PurchaseTest.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 736298400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnContinueButton()"
});
formatter.result({
  "duration": 191174700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnFinishButton()"
});
formatter.result({
  "duration": 190325600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iShouldBeAbleToSeeMessageThankYouForYourOrder()"
});
formatter.result({
  "duration": 77182800,
  "status": "passed"
});
formatter.after({
  "duration": 1807690500,
  "status": "passed"
});
});