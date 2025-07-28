package org.vwo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.vwo.basetest.CommonToAllTest;
import org.vwo.pages.PageObjectModel.DashboardPage_POM;
import org.vwo.pages.PageObjectModel.LoginPage_POM;
import org.vwo.utils.PropertyReader;

public class TestVWOLoginPOM extends CommonToAllTest {

    @Test(groups = "smoke")
    public void testLoginNegative() {

        LoginPage_POM loginPagePom = new LoginPage_POM();
        String error_message_attribute_data = loginPagePom.loginInvalidCredential();
        System.out.println(error_message_attribute_data);
        Assert.assertEquals(error_message_attribute_data, PropertyReader.readKey("error_message"));
    }

    @Test(groups = "smoke")
    public void testLoginPositive(){
        DashboardPage_POM dashboardPagePom = new DashboardPage_POM();
        String dashboardName = dashboardPagePom.loggedInUsernameDashboard();
        Assert.assertEquals(dashboardName, PropertyReader.readKey("expected_usernameDashboard"));
    }
}
