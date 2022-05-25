package com.qa.crm.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.crm.Base.CRMTestBase1;
import com.qa.crm.Pages.ContactsPage;
import com.qa.crm.Pages.HomePage;
import com.qa.crm.Pages.LoginPage;
import com.qa.crm.Util.Util;

public class ContactsPageTest extends CRMTestBase1{

	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactpage;
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginpage=new LoginPage();
		homepage=new HomePage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactpage=homepage.clickOnContactslink();
		
	}
	@Test
	public void verifycontactstextTest() {
		boolean contactsname=contactpage.verifycontactName();
		Assert.assertTrue(contactsname);
	}
	@Test
	public void clickonCreatelinkTest() {
		contactpage.clickOncreatelink();
	}
	@DataProvider
	public Object[][] getExcelTestData() throws IOException {
		Object data[][]=Util.getTestData2();
		return data;
	}
	@Test(dataProvider="getExcelTestData")
	public void createNewContactTest(String fName, String lName,String DOBday, String DOByear) throws InterruptedException {
	contactpage.createnewcontact(fName, lName, DOBday, DOByear);
	}
	
@AfterMethod
public void Teardown() {
	driver.quit();
		
}
}
