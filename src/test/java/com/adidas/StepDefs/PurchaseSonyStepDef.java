package com.adidas.StepDefs;

import com.adidas.Pages.CartPage;
import com.adidas.Pages.HomePage;
import com.adidas.Utilities.BrowserUtils;
import com.adidas.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.devtools.idealized.Javascript;

public class PurchaseSonyStepDef {

    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();
    @When("user click on Laptop button")
    public void user_click_on_laptop_button() {
        BrowserUtils.waitFor(2);
        homePage.laptopButton.click();

    }
    @When("user click on Sony vaio ifive")
    public void user_click_on_sony_vaio_ifive() {
        BrowserUtils.waitFor(2);

        homePage.sonyVaioI5.click();

    }
    @When("click on Add to cart")
    public void click_on_add_to_cart() {
        BrowserUtils.waitFor(2);

        homePage.addToCartButton.click();

    }
    @When("accept pop up confirmation")
    public void accept_pop_up_confirmation() {
        BrowserUtils.waitFor(2);

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }
    @When("user click on home button")
    public void user_click_on_home_button() {
        BrowserUtils.waitFor(2);

        homePage.homeButton.click();

    }
    @When("user click on Dell i7 8gb")
    public void user_click_on_dell_i7_8gb() {
        BrowserUtils.waitFor(2);
        homePage.dellI78gb.click();

    }
    @When("user click on cart button")
    public void user_click_on_cart_button() {
        BrowserUtils.waitFor(2);
        homePage.cartButton.click();
    }
    @When("user delete Dell i7 8gb from cart")
    public void user_delete_dell_i7_8gb_from_cart() {
        BrowserUtils.waitFor(2);
        cartPage.deleteButton.click();

    }
    @When("click on Place order")
    public void click_on_place_order() {
        BrowserUtils.waitFor(2);
        cartPage.placeOrderButton.click();

    }
    @When("fill in all web form fields")
    public void fill_in_all_web_form_fields() {
        BrowserUtils.waitFor(2);

        cartPage.nameField.sendKeys("L");
        cartPage.countryField.sendKeys("A");
        cartPage.cityOrderField.sendKeys("b");
        cartPage.creditCardField.sendKeys("1234");
        cartPage.monthOrderField.sendKeys("12");
        cartPage.cardYearField.sendKeys("194");

    }
    @When("click on Purchase")
    public void click_on_purchase() {
        BrowserUtils.waitFor(2);
        cartPage.purchaseButton.click();

    }
    @Then("users should see purchase amount as expected")
    public void users_should_see_purchase_amount_as_expected() {
        BrowserUtils.waitFor(2);
        String actualPrice = cartPage.successMessage.getText();
        String expectedPrice = cartPage.totalPrice.getText();
        Assert.assertTrue(actualPrice.contains(expectedPrice));

    }
    @Then("click on ok button")
    public void click_on_ok_button() {
        cartPage.okButton.click();
    }

}