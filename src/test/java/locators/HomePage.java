package locators;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableMethods.ReusableMethods;


public class HomePage {
	WebDriver driver;
	ReusableMethods reusableMethods;
	
	@FindBy(xpath="//*[@id='nav-tools']/a[1]/span[2]")
	WebElement hwrsigninTab;
	
	@FindBy(xpath="//*[@id='nav-flyout-ya-signin']/a[1]/span[1]")
	WebElement btnSignIn;
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
		reusableMethods=new ReusableMethods(this.driver);
		
	}
	
	public void howerToSignInTab() {
		reusableMethods.explicitWait(hwrsigninTab, 20);
		Actions action=new Actions(driver);
		action.moveToElement(hwrsigninTab).build().perform();			
	}
	
	public void clickOnSignOnButton() {
		reusableMethods.explicitWait(btnSignIn, 20);
		btnSignIn.click();
	}
	
	
	
	
}
