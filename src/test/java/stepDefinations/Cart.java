package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.*;
import locators.HomePage;
import locators.SignInPage;
import reusableMethods.DriverSetup;
import reusableMethods.ReusableMethods;

public class Cart {
	WebDriver driver;
	DriverSetup driverSetup;
	ReusableMethods reusableMethods;
	HomePage homePage;
	SignInPage signInPage;
	SoftAssert softAssert;
	
	@Given("^User has account account in Amazon site$")
	public void user_has_account_account_in_Amazon_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driverSetup=new DriverSetup();
		softAssert=new SoftAssert();
		
		
		
	}

	@When("^User opens Amazon URL using the \"([^\"]*)\" in \"([^\"]*)\" browser$")
	public void user_opens_Amazon_URL_using_the_in_browser(String url, String browser) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=driverSetup.assignBrowser(browser);
		reusableMethods=new ReusableMethods(driver);
		homePage=new HomePage(driver);
		signInPage=new SignInPage(driver);
		reusableMethods.openWebSite(url);
		
		
	    
	}

	@When("^Searches with \"([^\"]*)\" in the search bar$")
	public void searches_with_in_the_search_bar(String item) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage.searchFor(item);
	    
	}

	@When("^Click on search button$")
	public void click_on_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.clickOnSearchbutton();
	}

	@Then("^User is able to find \"([^\"]*)\" in the seach results$")
	public void user_is_able_to_find_in_the_seach_results(String item) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    softAssert.assertTrue(homePage.isItemPresent(item));
	    softAssert.assertAll();
	}

}
