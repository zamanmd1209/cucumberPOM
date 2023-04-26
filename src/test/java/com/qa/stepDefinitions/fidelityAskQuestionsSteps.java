package com.qa.stepDefinitions;

import org.openqa.selenium.By;

import com.qa.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fidelityAskQuestionsSteps extends TestBase {

	//LoginPage loginpage=new LoginPage();
	//HomePage homepage;
	
	//fidelityAskQuestionsPageModel fidelityPage= new fidelityAskQuestionsPageModel();
	//fidelityAskQuestionsPageModel fidelityPage;
	
	
	
	@Given("user opens chrome browser_")
	public void user_opens_chrome_browser() {
	  TestBase.initialization();  
	}

	@When("user is on fidelity main page")
	public void user_is_on_fidelity_main_page() throws InterruptedException{
Thread.sleep(3000);
		
	System.out.println("=====   Page Title # 1 is ===== :  "+driver.getTitle());
	




		

//		driver.findElement(By.xpath("//*[text()='Log In']")).click();
//	    loginpage= new LoginPage();
//		loginpage.LoginClick();
	}

//	@Then("user logs into app")
//	public void user_logs_into_app() throws InterruptedException {
//		//loginpage=new LoginPage();
//		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
//		
//	    
//	}
	
	
	
	@Then("user click on customer service link")
	public void user_click_customerServiceLink() throws Exception {
		//fidelityPage.customerServiceLInkClick();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]")).click();
		
		Thread.sleep(3000);
		// line added on 61
	  
	}

	@Then("user validate ask questions link")
	public void user_validate_askQuestionLink() throws InterruptedException {
		
		Thread.sleep(3000);
		
		System.out.println("Page Title 2 is :  "+driver.getTitle());
		
		Thread.sleep(3000);
		
		
	    
	}
	
	
	
	@Then("user click on login link")
	public void user_clicOn_loginLink() throws InterruptedException {
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[text()='Log In'])[1]")).click();
		
		Thread.sleep(3000);
		
	
		
	}
	@Then("user click on ask questions link")
	public void user_click_on_ask_questions_link() throws InterruptedException {
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[text()='Frequently Asked Questions']")).click();
	}
	
//	@And("user closes the browser")
//	public void user_closes_the_browser1() throws InterruptedException {
//		
//		
//
//		driver.quit();
//		
//		Thread.sleep(3000);
//		
//	
//		
//	}
	
	@Then("user closes the browser")
	public void user_closes_the_browser() throws InterruptedException {
		driver.quit();
		
		Thread.sleep(3000);
	}
	
}
