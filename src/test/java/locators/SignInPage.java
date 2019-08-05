package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableMethods.ReusableMethods;

public class SignInPage {
	private WebDriver driver;
	ReusableMethods reusableMethods;
	
	@FindBy(xpath="//*[@id='ap_email']")
	private WebElement txtUsername;
	
	@FindBy(xpath="//*[@id='continue']")
	private WebElement btnContinue;
	
	@FindBy(xpath="//*[@id='ap_password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	private WebElement btnLogin;
	
	
	public SignInPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
		reusableMethods=new ReusableMethods(this.driver);
		
	}
	
	public void inputUsername(String username) {
		reusableMethods.explicitWait(txtUsername, 20);
		txtUsername.sendKeys(username);
	}
	
	public void inputPassword(String password) {
		reusableMethods.explicitWait(txtPassword, 20);
		txtPassword.sendKeys(password);
	}
	
	public void clickOnContinueButton() {
		reusableMethods.explicitWait(btnContinue, 20);
		btnContinue.click();
	}
	
	public void clickOnLoginButton() {
		reusableMethods.explicitWait(btnLogin, 20);
		btnLogin.click();
	}

}
