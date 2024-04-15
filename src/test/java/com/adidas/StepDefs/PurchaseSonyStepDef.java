package com.adidas.StepDefs;

import com.adidas.Pages.HomePage;
import com.adidas.Utilities.BrowserUtils;
import com.adidas.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.devtools.idealized.Javascript;

public class PurchaseSonyStepDef {

    HomePage homePage = new HomePage();
    @When("user click on Laptop button")
    public void user_click_on_laptop_button() {
        BrowserUtils.sleep(3);
        homePage.laptopButton.click();

    }
    @And("user click on Sony vaio ifive")
    public void userClickOnSonyVaioIfive() {
        BrowserUtils.sleep(3);

        homePage.sonyVaioI5.click();
    }

    @When("click on Add to cart")
    public void click_on_add_to_cart() {
        BrowserUtils.sleep(3);

        homePage.addToCartButton.click();

    }
    @When("accept pop up confirmation")
    public void accept_pop_up_confirmation() {
        BrowserUtils.sleep(3);

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }



}
