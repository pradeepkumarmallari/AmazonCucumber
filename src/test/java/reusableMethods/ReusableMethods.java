package reusableMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	private WebDriver driver;
	
	public ReusableMethods(WebDriver driver) {
		this.driver=driver;
	}	
	
	public void openWebSite(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
