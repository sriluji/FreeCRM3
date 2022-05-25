package com.qa.crm.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.Base.CRMTestBase1;
import com.qa.crm.Pages.HomePage;
import com.qa.crm.Pages.LoginPage;

public class LoginTest extends CRMTestBase1 {
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginpage=new LoginPage();
	}
	
	@Test
	public void verifyurlLoginTest() {
		String urlTitle=loginpage.verifyurltitle();
		Assert.assertEquals(urlTitle, "Free CRM software for customer relationship management, sales, marketing campaigns and support.");
	}
	@Test
	public void verifyLoginTitleTest() {
		loginpage.loginLink();
		String loginpgTitle=loginpage.verifyLoginPageTitle();
		System.out.println(loginpgTitle);
		Assert.assertEquals(loginpgTitle, "Cogmento CRM");
	}
	@Test
	public void loginTest() throws InterruptedException {
		//loginpage.loginLink();
		Thread.sleep(5000);
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
