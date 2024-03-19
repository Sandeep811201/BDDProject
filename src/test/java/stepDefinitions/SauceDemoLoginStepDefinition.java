package stepDefinitions;

import commonUtils.BaseCL;
import elementPages.SauceDemoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SauceDemoLoginStepDefinition {

	public WebDriver driver;


	@Given("when Sauce Demo Page")
	public void when_sauce_demo_page() throws InterruptedException
	{
		String URL = "https://www.saucedemo.com/";
		this.driver = BaseCL.SetWebdriver(this.driver, URL);
	}

	@When("Enter username and password")
	public void enter_username_and_password()
	{
		(new SauceDemoPage(this.driver)).EnterUserNameAndPassword();
	}

	@When("click on login button")
	public void click_on_login_button()
	{
		(new SauceDemoPage(this.driver)).clickLoginButton();
	}

	@Then("home page should display")
	public void home_page_should_display()
	{
		(new SauceDemoPage(this.driver)).VerifyLogin();
		this.driver.close();
	}
}
