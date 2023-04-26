//package com.qa.util;
//
//
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import cucumber.api.java.After;
//
//import java.lang.reflect.Method;
//import java.util.Date;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//
//
//public class TestBase2 {
//
//public WebDriver driver = null;
//
//private Date start;
//
////public static WebDriver driver;
//public static Properties prop;
//
//public TestBase2() {
//	
//	try {
//		
//		prop= new Properties();
//		FileInputStream fis = new FileInputStream("C:\\Users\\AbuSiyam\\eclipse-workspace\\CucumberPOM\\src\\test\\java\\com\\qa\\config\\config.properties");
//		prop.load(fis);
//		
//		
//		
//	} catch (IOException e) {
//		
//		e.getMessage();
//		
//		tearDown();
//	}
//}
//
///*
//* Below method will initialize the driver once test method started
//* execution
//*/
//public void initializeDriver(WebDriver driver) {
//
//   this.driver = driver;
//   
//   String browserName= prop.getProperty("browser");
//	
//	if(browserName.equalsIgnoreCase("chrome")) {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		driver= new ChromeDriver();
//		
//	}else if(browserName.equalsIgnoreCase("FF")) {
//		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//		driver= new FirefoxDriver();
//	
//	}
//	
//	
//	
////	public void openurl() {
//	
//	driver.manage().window().maximize();
//	
//	driver.get(prop.getProperty("url1"));
//   
//   
//
//}
//
///*
//* Below method will kill driver
//*/
//public void tearDown() {
//
//   if (this.driver != null) {
//       this.driver.quit();
//   }
//
//}
//@After 
////@AfterMethod(alwaysRun = true)
//public void afterTestMethod(Method method) {
//
//   // Clean ups for test level services
//   tearDown();
//
//}
//
//@AfterSuite(alwaysRun = true)
//public void afterTestSuite() {
//
//   tearDown();
//
//}
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////public class TestBase2 {
////	
////	public static WebDriver driver;
////	public static Properties prop;
////	
////	public TestBase2() {
////		
////		try {
////			
////			prop= new Properties();
////			FileInputStream fis = new FileInputStream("C:\\Users\\AbuSiyam\\eclipse-workspace\\CucumberPOM\\src\\test\\java\\com\\qa\\config\\config.properties");
////			prop.load(fis);
////			
////			
////			
////		} catch (IOException e) {
////			e.getMessage();
////		}
////	}
////	
////	@Test
////		
////		public static void initialization() {
////		
////			String browserName= prop.getProperty("browser");
////			
////			if(browserName.equalsIgnoreCase("chrome")) {
////				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
////				driver= new ChromeDriver();
////				
////			}else if(browserName.equalsIgnoreCase("FF")) {
////				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
////				driver= new FirefoxDriver();
////			
////			
////		
////			driver.manage().window().maximize();}
////			
////			
////			
//////			public void openurl() {
////			
////			driver.get(prop.getProperty("url1"));
////	}
////		
////	
////			@AfterMethod
////			
////			public void tearDown() {
////				
////				driver.close();
////				
////			}
////	
////			}
////	
////	
////	
////
////
