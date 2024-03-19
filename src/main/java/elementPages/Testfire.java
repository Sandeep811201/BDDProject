package elementPages;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testfire {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandeep\\eclipse-workspace\\HclSelDemo\\drivers\\chromedriver.exe");
		ChromeOptions options = new  ChromeOptions();
		options.setBinary("C:\\Users\\Sandeep\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement SearchBar= driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		SearchBar.sendKeys("Iphone");
		SearchBar.submit();
		
		System.out.println("list of Iphones displayed");
		/*
		 * Actions act = new Actions(driver); act.click(SearchBar);
		 * act.sendKeys("Iphone").build().perform();
		 */
		WebDriverWait wt  = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[span[contains(text(),'Iphone')]]")));
		WebElement IphoneSelect = driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 14 (Starlight, 128 GB)')]"));
		Actions act1 = new Actions(driver);
		act1.scrollToElement(IphoneSelect);
		IphoneSelect.click();
		System.out.println("Clicked on Iphone14");
		Thread.sleep(3000);
		String parentWin = driver.getWindowHandle();
		Set<String> winid = driver.getWindowHandles();
		for(String WindowId : winid)
		{
			driver.switchTo().window(WindowId);
			if (driver.getTitle().equalsIgnoreCase("APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com"))
			{
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
				System.out.println("move to kart action performed");
				Thread.sleep(2000);
				WebElement placeOrderbtn= driver.findElement(By.xpath("//span[contains(text(),'Place Order')]"));
				boolean value = placeOrderbtn.isDisplayed();
				System.out.println("Phone moved to kart ? = "+value);
				
			}
		}
		driver.close();
		driver.switchTo().window(parentWin);
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		System.out.println("Test Successful");
		
		

	}

}
