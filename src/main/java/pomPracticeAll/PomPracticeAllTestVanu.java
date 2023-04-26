//package pomPracticeAll;
//
//import java.util.concurrent.TimeUnit;
//import java.util.function.Function;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//import org.testng.annotations.Test;
//
//public class PomPracticeAllTestVanu {
//
//	protected WebDriver driver;
//	@Test
//	public void testPractice() {
//		System.setProperty ("webdriver.chrome.driver",".//drivers//chromedriver.exe" );
//		
//		String eTitle = "Demo Guru99 Page";
//		String aTitle = "" ;
//		driver = new ChromeDriver();
//		// launch Chrome and redirect it to the Base URL
//		driver.get("http://demo.guru99.com/test/guru99home/" );
//		//Maximizes the browser window
//		driver.manage().window().maximize() ;
//		//get the actual value of the title
//		aTitle = driver.getTitle();
//		//compare the actual title with the expected title
//		
//		System.out.println("Page Title is:  =====\n"+aTitle);
//		if (aTitle.contentEquals(eTitle))
//		{
//		System.out.println( "Test Passed") ;
//		}
//		else {
//		System.out.println( "Test Failed" );
//			}
//		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
//				.withTimeout(30, TimeUnit.SECONDS) 			
//				.pollingEvery(5, TimeUnit.SECONDS) 			
//				.ignoring(NoSuchElementException.class);
//		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
//		
//			public WebElement apply(WebDriver driver ) {
//				return driver.findElement(By.xpath("(//a[@class=\"item\"])[2]"));
//			}
//		});
//		//click on the selenium link
//		clickseleniumlink.click();
//		//close~ browser
//		driver.close();
//		driver.quit();
//		}
//	}
//		
//	
