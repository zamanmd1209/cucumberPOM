//package pomPracticeAll;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.Test;
//
//public class AddHeaderOnRequest {
//	
//	WebDriver driver;
//	@Test
//	public void setUp() {
//	    //BrowserMobProxy proxy = new BrowserMobProxyServer();
//	    //proxy.start(12345);
//	    ChromeOptions options = new ChromeOptions();
//	    //options.setProxy(ClientUtil.createSeleniumProxy(new InetSocketAddress("192.168.1.2", 12345)));
//	    try {
//	       driver = new RemoteWebDriver(new URL("http://your-hub-host:4444/wd/hub"), options);
//	    } catch (MalformedURLException e) {
//	        e.printStackTrace();
//	    }
//	}
//	
//	
//}