package locators;



import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	WebElement txtSearchBar;
	
	@FindBy(xpath="//*[@id='nav-search-submit-text']")
	WebElement btnSearch;
	
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
	
	public void clickOnSignInTab() {
		reusableMethods.explicitWait(hwrsigninTab, 20);
		hwrsigninTab.click();
	}
	
	public void searchFor(String item) {
		reusableMethods.explicitWait(txtSearchBar, 20);
		txtSearchBar.sendKeys(item);
	}
	
	public void clickOnSearchbutton() {
		reusableMethods.explicitWait(btnSearch, 20);
		btnSearch.click();
	}
	
	public boolean isItemPresent(String value) {
		boolean flag=false;
		List<WebElement> items=driver.findElements(By.tagName("span"));
		for(WebElement item:items) {
			if(item.getText().contains(value)) {
				flag=true;
				break;
			}
			
		}
		return flag;
	}
}
