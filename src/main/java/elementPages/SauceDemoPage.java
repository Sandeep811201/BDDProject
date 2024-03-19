package elementPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPage {
	public WebDriver driver;
	@FindBy(
			id = "user-name"
	)
	public WebElement UName;
	@FindBy(
			id = "password"
	)
	public WebElement pwd;
	@FindBy(
			id = "login-button"
	)
	public WebElement LoginButton;
	@FindBy(
			xpath = "//div[contains(text(), 'Swag Labs')]"
	)
	public WebElement verifyHomePage;

	public SauceDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void EnterUserNameAndPassword() {
		this.UName.sendKeys(new CharSequence[]{"standard_user"});
		this.pwd.sendKeys(new CharSequence[]{"secret_sauce"});
	}

	public void clickLoginButton() {
		this.LoginButton.click();
	}

	public void VerifyLogin() {
		String lpV = this.verifyHomePage.getText();
		System.out.println(lpV);
	}
}
