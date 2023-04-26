package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;






public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase() {
		
		try {
			
			prop= new Properties();
			FileInputStream fis = new FileInputStream("C:\\MdFiles\\eclipse-workspace\\CucumberPOM\\src\\test\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
			
			
			
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	//@Test
	
	//@BeforeMethod(alwaysRun = true)
	@Before()
   // public void init() {
		
		public static void initialization() {
		
//		try {
//			prop= new Properties();
//			FileInputStream fis = new FileInputStream("C:\\Users\\AbuSiyam\\eclipse-workspace\\CucumberPOM\\src\\test\\java\\com\\qa\\config\\config.properties");
//			prop.load(fis);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
			String browserName= prop.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver= new ChromeDriver();
				
			}else if(browserName.equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver= new FirefoxDriver();
			
			
		
			}
			
			
			
//			public void openurl() {
			//driver.manage().window().maximize();
			
			driver.get(prop.getProperty("url1"));
			
			driver.manage().window().maximize();
	}
	
	
	//@AfterMethod(alwaysRun = true)
	@After()
    public void driverQuitter(){
       // if(driver != null){
           // logger.info("Closing browser after TestClass");
            driver.quit();
       // }else{
           // logger.error("Driver is null at AfterClass (TestBase)");
        }
       // logger.info("Teardown - Exiting");
   // }
		
//	@After
//	
//	public void teardown() {
//		
//		//if(driver!=null) {
//			
//			driver.close();
//		}
//	
//	
			//@After
			
			public void tearDown() {
				
				if (driver != null) {
			        driver.quit();
			    }
			}
	
}
	
	
	


