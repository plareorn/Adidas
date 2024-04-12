package com.adidas.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;

public abstract class  BasePage {

    @FindBy (xpath = "(//a[@class='nav-link'])[1]")
    public WebElement homeButton;

    @FindBy (id ="cartur")
    public WebElement cartButton;

    @FindBy (css = ".btn-success")
    public WebElement addToCartButton;

}
