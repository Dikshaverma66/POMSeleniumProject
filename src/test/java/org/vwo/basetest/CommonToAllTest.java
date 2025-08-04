package org.vwo.basetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.vwo.driver.DriverManagerTL;

public class CommonToAllTest {


    //Start the WebDriver
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        DriverManagerTL.init();
    }

    //Down the WebDriver
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        DriverManagerTL.down();
    }





    
}
