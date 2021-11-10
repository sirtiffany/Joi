package com.Joi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//tset
public class PageObject {
    protected WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
