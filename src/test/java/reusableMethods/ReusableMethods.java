package reusableMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
	private WebDriver driver;
	private WebDriverWait webDriverWait;
	
	public ReusableMethods(WebDriver driver) {
		this.driver=driver;
	}	
	
	public void openWebSite(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void explicitWait(WebElement element, int time) {
		webDriverWait=new WebDriverWait(driver, time);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
}
