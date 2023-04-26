package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class BasePage {
	
	public WebDriver driver = null;

	//private Date start;

	/*
	 * Below method will initialize the driver once test method started
	 * execution
	 */
	public static Properties prop;
	
	//public static Properties prop;

	public BasePage() {
		
		try {
			
			prop= new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\AbuSiyam\\eclipse-workspace\\CucumberPOM\\src\\test\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
			
			
			
		} catch (IOException e) {
			e.getMessage();
			tearDown();
		}
	}
	public void initializeDriver(WebDriver driver) throws IOException {

		   this.driver = driver;
		   
		   String browserName= prop.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver= new ChromeDriver();
				
			}else if(browserName.equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver= new FirefoxDriver();
			
			}
			ChromeOptions option= new ChromeOptions();
			
			
			
//			public void openurl() {
			
			//driver.manage().window().maximize();
			
			driver.get(prop.getProperty("url1"));
			
			driver.manage().window().maximize();
		   
		   

		}

	/*
	 * Below method will kill driver
	 */
	public void tearDown() {

	    if (this.driver != null) {
	        this.driver.quit();
	    }

	}

	@AfterMethod(alwaysRun = true)
	public void afterTestMethod(Method method) {

	    // Clean ups for test level services
	    tearDown();

	}

	@AfterSuite(alwaysRun = true)
	public void afterTestSuite() {

	    tearDown();

	}


	}