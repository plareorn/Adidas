package com.adidas.Pages;

import com.adidas.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{
    public CartPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//a[text()='Delete']")
    public WebElement deleteButton;

    @FindBy (id = "name")
    public WebElement nameField;

    @FindBy(id = "card")
    public WebElement creditCardField;

    @FindBy(id = "year")
    public WebElement cardYearField;

    @FindBy (id = "month")
    public WebElement monthOrderField;

    @FindBy (id = "country")
    public WebElement countryField;

    @FindBy (id = "city")
    public WebElement cityOrderField;

    @FindBy (css = "button[onclick='purchaseOrder()']")
    public WebElement purchaseButton;

    @FindBy (xpath = "//p[@class='lead text-muted ']")
    public WebElement successMessage;

    @FindBy (xpath = "//button[.='OK']")
    public WebElement okButton;

    @FindBy (id = "totalp")
    public WebElement totalPrice;


}
