//package TD;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.Test;
//
//public class TDTest {
//	
//	WebDriver driver;
//	@Test
//	public void login() throws Exception {
//		
//		System.setProperty("webdriver.chrome.driver", "./driverss/chromedriver.exe");
//		
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://google.com");
//		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("India"+Keys.ENTER);
//		
//		Thread.sleep(3000);
//		
//		try {
//			String indiaText = driver.findElements(By.cssSelector("h3.LC20lb.DKV0Md")).get(0).getText();
//			Assert.assertEquals(indiaText, "India - Wikipedia");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		Thread.sleep(3000);
//		
//	
//		
//
//	}
//	
//	@AfterTest
//	public void tearDown() {
//		driver.close();
//		
//	}
//
//}
