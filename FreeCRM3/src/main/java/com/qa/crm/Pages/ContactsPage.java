package com.qa.crm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.crm.Base.CRMTestBase1;

public class ContactsPage extends CRMTestBase1{
	
	//PageFactory
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement contactname;
	@FindBy(xpath="//a[@href='/contacts/new']")
	WebElement createlink;
	@FindBy(name="first_name")
	WebElement first_name;
	@FindBy(name="last_name")
	WebElement last_name;
	@FindBy(name="status")
	WebElement status;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[1]/div/div/div[2]/div[2]")
	WebElement status_new;
	@FindBy(name="channel_type")
	WebElement  channel_type;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[1]/div/div/div/div[1]/div/div[2]/div[2]")
	WebElement channel_facebook;
	@FindBy(name="day")
	WebElement dtofBday;
	@FindBy(name="month")
	WebElement dtofBmonth;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[12]/div[2]/div/div/div[2]/div[2]/div[2]/span")
	WebElement DOBmonth;
	@FindBy(name="year")
	WebElement dtofByear;
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement savebtn;
	
	//Initialization
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public boolean verifycontactName() {
		return contactname.isDisplayed();
	}
	public void clickOncreatelink() {
	createlink.click();
	}
	public void createnewcontact(String fName,String lName,String DOBday, String DOByear) throws InterruptedException  {
		//not necessary to create pagefactory for all the elements--can use directly here
		//String DOBday, String DOByear
		createlink.click();
		first_name.sendKeys(fName);
		last_name.sendKeys(lName);
		status.click();
		status_new.click();
		channel_type.click();
		channel_facebook.click();
		dtofBday.sendKeys(DOBday);
//		dtofBmonth.click();
//		DOBmonth.click();
		dtofByear.sendKeys(DOByear);
		Thread.sleep(5000);
		savebtn.click();
		//Actions action=new Actions(driver);
//		action.moveToElement(status).click();
//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[1]/div/div/div[2]/div[2]/span"))).click();
//		action.moveToElement(channel_type).click();
		//action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[1]/div/div/div/div[1]/div/div[2]/div[2]"))).click();
//		Select select=new Select(driver.findElement(By.name("status")));
//		select.selectByVisibleText(status);
//		Select select1=new Select(channel_type);
//		select1.selectByVisibleText(channel);
		
				
	}

		
}
