package com.emp.in.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	
	
	    WebDriver driver;

	    By todayAttend = By.xpath("//button[normalize-space()='Send']");
	    By dailytasks = By.xpath("//input[@placeholder='Enter Your Task']");
	    By taskAdd = By.xpath("//button[normalize-space()='ADD']");
	    public DashboardPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    
	    public void dashboard(String user) throws InterruptedException {
	    	driver.findElement(todayAttend).click();
	        driver.findElement(dailytasks).sendKeys(user);
	        Thread.sleep(2000);
	        driver.findElement(taskAdd).click();
	    }
	    
	    
	    public void updateTask() throws InterruptedException {
	    	Thread.sleep(5000);
	    	driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > div:nth-child(1) > div:nth-child(2) > svg:nth-child(1)")).click();
	    	WebElement uptaskNew = driver.findElement(By.xpath("//input[@placeholder='Enter Your Task']"));
	    	uptaskNew.clear();
	    	uptaskNew.sendKeys("Dept_module");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[normalize-space()='UPDATE']")).click();
	    }
	    public void deleteTask() throws InterruptedException {
	    	Thread.sleep(7000);
	    		    	 WebElement clickIcon = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > div:nth-child(1) > div:nth-child(2) > svg:nth-child(2)"));
	    	 clickIcon.click();
	    }

	    public void goToHolidays() {
	    	try {
				Thread.sleep(10000);
				 driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(2)")).click();
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    } 
	    public void goToPayroll() {
	    	try {
				Thread.sleep(5000);
				 driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3)")).click();
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }  
	    
	    public void goToDepartment() {
	    	try {
				Thread.sleep(5000);
				 driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(4)")).click();
				 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }  
	    public void goToMessanger() {
	    	try {
				Thread.sleep(7000);
				 driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(5)")).click();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }  
	
	    public void goToTasks() {
	    	try {
				Thread.sleep(7000);
				 driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(6) > p:nth-child(2)")).click();	 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }  

	    public void goToSetting() {
	    	try {
				Thread.sleep(5000);
				 driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(7)")).click();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    public void goToLeave() {
	    	try {
				Thread.sleep(7000);
				 driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(8)")).click();
				 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }  
}
