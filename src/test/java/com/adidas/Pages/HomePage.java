package com.adidas.Pages;

import com.adidas.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[text()='Laptops']")
    public WebElement laptopButton;

    @FindBy (xpath = "//a[text()='Sony vaio i5']")
    public WebElement sonyVaioI5;

    @FindBy (css = "#tbodyid > div:nth-of-type(1) .hrefch")
    public WebElement dellI78gb;


}
