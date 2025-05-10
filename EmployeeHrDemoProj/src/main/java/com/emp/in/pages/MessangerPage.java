package com.emp.in.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessangerPage {
	 WebDriver driver;
	    WebDriverWait wait;

	    @FindBy(xpath = "//input[@placeholder='Search chats...']")
	    WebElement searchMesgInput;

	    public MessangerPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }


	 public void searchMsg(String deptName) {
	        wait.until(ExpectedConditions.visibilityOf(searchMesgInput));
	        searchMesgInput.clear();
	        searchMesgInput.sendKeys(deptName);
	    }
}
