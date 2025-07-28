package org.vwo.pages.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.vwo.base.CommonToAllPages;
import org.vwo.utils.PropertyReader;

public class DashboardPage_POM extends CommonToAllPages {

    WebDriver driver;

    public DashboardPage_POM() {
        super();
    }

    //Page Locators
    private By email = By.id("login-username");
    private By password = By.id("login-password");
    private By loginButton = By.id("js-login-btn");
    private By userNameDashboard = By.xpath("//span[@data-qa=\"lufexuloga\"]");
    private By dashboardButton = By.xpath("//a[@class=\"ng-binding ng-scope\"]");

    //Page Actions
    public String loggedInUsernameDashboard() {
        openVWOLoginURL();
        enterInput(email, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElement(loginButton);
        presenceOfElement(dashboardButton);
        visibilityOfElementLocated(dashboardButton);
        clickElement(dashboardButton);
        presenceOfElement(userNameDashboard);
        visibilityOfElementLocated(userNameDashboard);
        return getElement(userNameDashboard).getText();
    }
}
