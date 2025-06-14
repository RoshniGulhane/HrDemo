package com.emp.in.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HolidayPage {

	 WebDriver driver;
	    WebDriverWait wait;

	    @FindBy(xpath = "//input[@placeholder='Search holidays...']")
	    WebElement searchHolidayInput;

	    public HolidayPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	
	public void searchHoliday(String deptName) {
        wait.until(ExpectedConditions.visibilityOf(searchHolidayInput));
        searchHolidayInput.clear();
        searchHolidayInput.sendKeys(deptName);
    }
}
