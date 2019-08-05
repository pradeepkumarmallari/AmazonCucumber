package reusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverSetup {
	WebDriver driver;
	
	public WebDriver assignBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//src//test//java//drivers//chromedriver.exe");
			  
			driver=new ChromeDriver();
		}
		else if(browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", ".//src//test//java//drivers//IEDriverServer.exe");
			  
			driver=new InternetExplorerDriver();
		}
		else driver=null;
		return driver;
	}
}
