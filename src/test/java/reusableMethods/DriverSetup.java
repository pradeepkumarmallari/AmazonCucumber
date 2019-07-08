package reusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	WebDriver driver;
	
	public WebDriver assignBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".src//test//java//drivers//chromedriver.exe");
			  
			driver=new ChromeDriver();
		}
		else if(browser.equals("IE")) {
			System.setProperty("webdriver.IE.driver", ".\\src\\resources\\IEDriver.exe");
			  
			driver=new ChromeDriver();
		}
		else driver=null;
		return driver;
	}
}
