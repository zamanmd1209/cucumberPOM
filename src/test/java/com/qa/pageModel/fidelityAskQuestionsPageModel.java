package com.qa.pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class fidelityAskQuestionsPageModel extends TestBase{ 
	
	
	@FindBy(xpath = "(//a[text()='Customer Service'])[1]")
	WebElement customeServiceLink;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement username;
	
	public By username1= By.xpath("//input[@type='text']");
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//div[@class=\"ui fluid large blue submit button\"]")
	
	WebElement submit_button;
	
	@FindBy(xpath="//div")
	
	WebElement button_1;
	@FindBy(xpath="")
	WebElement log_1;
	private By log_button= By.xpath("");
	@FindBy(xpath="//div[@class='submit']")
	WebElement button_2;
	
	
	//initializing page Object
	
	public fidelityAskQuestionsPageModel() {
		PageFactory.initElements(driver,this);
		
	}
	
	public void customerServiceLInkClick() throws Exception {
		Thread.sleep(4000);
		
		customeServiceLink.click();
		
		
	}
	public void login(String uname, String pass) throws InterruptedException {
		
		
		Thread.sleep(3000);
		//driver.findElement(username1).sendKeys(uname);
		username.sendKeys(uname);
		password.sendKeys(pass);
		submit_button.click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
