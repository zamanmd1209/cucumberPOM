package com.qa.stepDefinitions;

import org.openqa.selenium.By;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBase {

	LoginPage loginpage=new LoginPage();
	HomePage homepage;
	
	@Given("user opens browser")
	public void user_opens_browser() {
	  TestBase.initialization();  
	}
	
//	@Given("user opens chrome browser")
//	public void user_opens_chrome_browser() {
//	  TestBase.initialization();  
//	}

	@When("user is on login page")
	public void user_is_on_login_page() throws Exception {
//		driver.findElement(By.xpath("//*[text()='Log In']")).click();
	    loginpage= new LoginPage();
		loginpage.login_click();
	}

	@Then("user logs into app")
	public void user_logs_into_app() throws InterruptedException {
		//loginpage=new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	    
	}

	@Then("user validate home page tittle")
	public void user_validate_home_page_tittle() {
	    
	}
	
	
}
