package stepDefinations;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.*;
import reusableMethods.DriverSetup;
import reusableMethods.ReusableMethods;

public class Cart {
	WebDriver driver;
	DriverSetup driverSetup=new DriverSetup();
	ReusableMethods reusableMethods;
	
	@Given("^User has account account in Amazon site$")
	public void user_has_account_account_in_Amazon_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		reusableMethods=new ReusableMethods(driver);
		
	}

	@When("^User opens Amazon URL using the \"([^\"]*)\" in \"([^\"]*)\" browser$")
	public void user_opens_Amazon_URL_using_the_in_browser(String url, String browser) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=driverSetup.assignBrowser(browser);
		reusableMethods.openWebSite(url);
		
	    
	}

	@When("^Enter credentials using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_credentials_using_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Click on Sign in button$")
	public void click_on_Sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^User is able to login using credentials$")
	public void user_is_able_to_login_using_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
