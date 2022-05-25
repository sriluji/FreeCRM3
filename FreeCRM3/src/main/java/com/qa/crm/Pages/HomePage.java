package com.qa.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.Base.CRMTestBase1;

public class HomePage extends CRMTestBase1{
	
	
	//PageFactory
	
	@FindBy(xpath="//a[@href='/contacts']")
	WebElement contactslink;
	
	@FindBy(xpath="//a[@href='/calendar']")
	WebElement calendarlink;
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement userNameLabel;
	
	//Initialization
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public boolean verifyuserNameLabel() {
		return userNameLabel.isDisplayed();
	}
	public ContactsPage clickOnContactslink() {
		contactslink.click();
		return new ContactsPage();
	}
	public CalendarPage clickOnCalendarlink() {
		calendarlink.click();
		return new CalendarPage();
		
	}

}
