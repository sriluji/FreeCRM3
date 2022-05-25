package com.qa.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.Base.CRMTestBase1;

public class LoginPage extends CRMTestBase1 {
	
	
	
	
	
	//PageFactory
	@FindBy(xpath="//a[@href='https://ui.freecrm.com/']")
	WebElement login;
	
	@FindBy(name="email")
	WebElement emailAddress;
	
	@FindBy(name="password")
	WebElement password;
	//*[@id="ui"]/div/div/form/div/div[3]
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyurltitle() {
		return driver.getTitle();
	}
	public void loginLink() {
		login.click();
	}
	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}
	public HomePage login(String un,String pwd) {
		login.click();
		emailAddress.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
		
	}
}
