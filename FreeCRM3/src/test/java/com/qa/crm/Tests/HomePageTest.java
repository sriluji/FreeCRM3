package com.qa.crm.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.Base.CRMTestBase1;
import com.qa.crm.Pages.CalendarPage;
import com.qa.crm.Pages.ContactsPage;
import com.qa.crm.Pages.HomePage;
import com.qa.crm.Pages.LoginPage;

public class HomePageTest extends CRMTestBase1 {
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	CalendarPage calendarpage;
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		initialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyhomePageTitleTest() {
		String homePageTitle=driver.getTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM");
	}
	
	@Test
	public void clickOncontactslinkTes() {
		contactspage=homepage.clickOnContactslink();
	}
	@Test
	public void clickOncalendarlinkTes() {
		calendarpage=homepage.clickOnCalendarlink();
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
