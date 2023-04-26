package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{ 
	
	
	@FindBy(xpath = "//*[text()='Log In']")
	WebElement login_button;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//div[@class=\"ui fluid large blue submit button\"]")
	WebElement submit_button;
	
	//initializing page Object
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public void LoginClick() throws Exception {
		Thread.sleep(4000);
		
		login_button.click();
		
		
	}
	public void login(String uname, String pass) throws InterruptedException {
		
		
		Thread.sleep(3000);
		username.sendKeys(uname);
		password.sendKeys(pass);
		submit_button.click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
