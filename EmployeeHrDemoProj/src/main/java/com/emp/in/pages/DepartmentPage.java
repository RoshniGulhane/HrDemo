package com.emp.in.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartmentPage {

	 WebDriver driver;
	    WebDriverWait wait;

	    // Use @FindBy for better readability and maintainability
	    @FindBy(xpath = "//input[@placeholder='Search Department...']")
	    WebElement searchDeptInput;

	    public DepartmentPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    public void searchDept(String deptName) {
	        wait.until(ExpectedConditions.visibilityOf(searchDeptInput));
	        searchDeptInput.clear();
	        searchDeptInput.sendKeys(deptName);
	    }
}
