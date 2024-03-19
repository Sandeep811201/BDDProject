package commonUtils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class BaseCL {

	public static WebDriver SetWebdriver(WebDriver driver, String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandeep\\eclipse-workspace\\HclSelDemo\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Sandeep\\Downloads\\chrome-win64\\chrome.exe");
        driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		return driver;
	}
	
}
