package com.emp.in.test;

import org.testng.annotations.Test;
import com.emp.in.core.BaseTest;
import com.emp.in.pages.DashboardPage;
import com.emp.in.pages.DepartmentPage;
import com.emp.in.pages.HolidayPage;
import com.emp.in.pages.LeavePage;
import com.emp.in.pages.LoginPage;
import com.emp.in.pages.MessangerPage;
import com.emp.in.pages.PayrollPage;
import com.emp.in.pages.SettingPage;
import com.emp.in.pages.TaskPage;


public class EmployeeHrTest extends BaseTest {
	
	 @Test(priority = 1)
	    public void loginTest() throws InterruptedException {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("adminuser@yopmail.com", "Bluehr@1234");
	    }
	 @Test(priority = 2)
	    public void dashboardTest() throws InterruptedException {
	        DashboardPage dashboardPage = new DashboardPage(driver);
	        dashboardPage.dashboard("deptModule");
	       
	    }
	 @Test(priority = 3)
	    public void updateDashboardTest() throws InterruptedException {
	        DashboardPage dashboardPage = new DashboardPage(driver);
	        dashboardPage.updateTask();
	       
	    }
	 @Test(priority = 4)
	    public void deleteDashboardTest() throws InterruptedException {
	        DashboardPage dashboardPage = new DashboardPage(driver);
	        dashboardPage.deleteTask();
	       
	    }
	 @Test(priority = 5)
	    public void departmentTest() throws InterruptedException {
	        DashboardPage dashboardPage = new DashboardPage(driver);
	        dashboardPage.goToDepartment();
	        DepartmentPage departmentPage = new DepartmentPage(driver);
	        departmentPage.searchDept("testing");
	 }
	 @Test(priority = 6)
	    public void payrollTest() throws InterruptedException {
	        DashboardPage dashboardPage = new DashboardPage(driver);
	        dashboardPage.goToPayroll();
	        PayrollPage payPage = new PayrollPage(driver);
	       
	 }
	 @Test(priority = 7)
	    public void massengerTest() throws InterruptedException {
	        DashboardPage dashboardPage = new DashboardPage(driver);
	        dashboardPage.goToMessanger();
	        MessangerPage message = new MessangerPage(driver);
	        message.searchMsg("Deepanshu Sharma");
	 }
	 @Test(priority = 8)
	    public void holidayTest() throws InterruptedException {
	        DashboardPage dashboardPage = new DashboardPage(driver);
	        dashboardPage.goToHolidays();
	        HolidayPage holiPage = new HolidayPage(driver);
	        holiPage.searchHoliday("Christmas");
	       
	 }
	 @Test(priority = 9)
	    public void settingTest() throws InterruptedException {
	        DashboardPage dashboardPage = new DashboardPage(driver);
	        dashboardPage.goToSetting();
	        SettingPage deptPage = new SettingPage(driver);
	       
	 }
	 @Test(priority = 10)
	    public void leaveTest1() throws InterruptedException {
	        DashboardPage dashboardPage = new DashboardPage(driver);
	        dashboardPage.goToLeave();
	        LeavePage leavePage = new LeavePage(driver);
	        leavePage.searchLeave("aaaaa");
	 }
	 @Test(priority = 11)
	    public void leaveTest2() throws InterruptedException {
	        DashboardPage dashboardPage = new DashboardPage(driver);
	        dashboardPage.goToLeave();
	        LeavePage leavePage = new LeavePage(driver);
	        leavePage.viewLeave();
	 }
	 @Test(priority = 12)
	    public void leaveTest3() throws InterruptedException {
	        DashboardPage dashboardPage = new DashboardPage(driver);
	        dashboardPage.goToLeave();
	        LeavePage leavePage = new LeavePage(driver);
	        leavePage.requestLeave();
	 }

//	 @Test(priority = 13)
//	    public void taskTest() throws InterruptedException {
//	        DashboardPage dashboardPage = new DashboardPage(driver);
//	        dashboardPage.goToTasks();
//	        TaskPage deptPage = new TaskPage(driver);
//	       
//	 }
	 
}
