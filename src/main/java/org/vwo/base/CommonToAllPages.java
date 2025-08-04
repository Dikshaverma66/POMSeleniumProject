package org.vwo.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.vwo.utils.PropertyReader;

import java.time.Duration;

//import static org.vwo.driver.DriverManager.getDriver;
import static org.vwo.driver.DriverManagerTL.getDriver;


public class CommonToAllPages {

    public CommonToAllPages() {
        //If you want to call something before every Page Object Class call. Put you code here
        //Open File, open Database connection,
    }

    public void openVWOLoginURL(){
        if(getDriver()!=null){
            getDriver().get(PropertyReader.readKey("url"));
        }
        else {
            System.err.println("WebDriver is null. Cannot navigate to URL.");
        }

    }

    //This is common to All the pages.
    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }

//    public void clickElement(WebElement element) {
//        element.click();
//    }

    public void enterInput(By by, String key) {

        getDriver().findElement(by).sendKeys(key);
    }

//    public void enterInput(WebElement element, String key) {
//        element.sendKeys(key);
//    }

    public WebElement getElement(By key){
        return getDriver().findElement(key);

    }

    //Write waits here
    public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }// presence of element means to check whether the element is present on the page or not


    public WebElement visibilityOfElementLocated(By elementLocation) {
      return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }


}

