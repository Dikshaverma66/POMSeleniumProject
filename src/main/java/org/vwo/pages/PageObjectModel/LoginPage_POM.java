package org.vwo.pages.PageObjectModel;

import org.openqa.selenium.By;

import org.vwo.base.CommonToAllPages;
import org.vwo.utils.PropertyReader;


public class LoginPage_POM extends CommonToAllPages {


    public LoginPage_POM() {
        super();
    }

    //Page Locators
    private By email = By.id("login-username");
    private By password = By.id("login-password");
    private By loginButton = By.id("js-login-btn");
    private By error_msg = By.id("js-notification-box-msg");

    //Page Actions
    public String loginInvalidCredential() {
        openVWOLoginURL();
        enterInput(email, PropertyReader.readKey("username"));
        enterInput(password, "test");
        clickElement(loginButton);
        presenceOfElement(error_msg);
        visibilityOfElementLocated(error_msg);
        return getElement(error_msg).getText();
    }
}
