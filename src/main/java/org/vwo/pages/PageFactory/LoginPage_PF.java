//package org.vwo.pages.PageFactory;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.vwo.base.CommonToAllPages;
//import org.vwo.utils.PropertyReader;
//
//
//public class LoginPage_PF extends CommonToAllPages {
//
//    WebDriver driver;
//
//    public LoginPage_PF(WebDriver driver) {
//
//        super();
//        PageFactory.initElements(driver,this);
//    }
//
//    //Page Locators
//    @FindBy(id = "login-username")
//    private WebElement email;
//    @FindBy(id = "login-password")
//    private WebElement password;
//    @FindBy(id = "js-login-btn")
//    private WebElement loginButton;
//    @FindBy(id = "js-notification-box-msg")
//    public static WebElement error_msg;
//
//    //Page Actions
//    public String loginInvalidCredential() {
//        openVWOLoginURL();
//        enterInput(email, PropertyReader.readKey("username"));
//        enterInput(password, "test");
//        clickElement(loginButton);
//        presenceOfElement(error_msg);
//        visibilityOfElementLocated(error_msg);
//        return getElement(error_msg).getText();
//    }
//}
