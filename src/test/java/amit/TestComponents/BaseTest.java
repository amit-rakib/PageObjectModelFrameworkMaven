package amit.TestComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amit.pageObjects.LandingPage;

public class BaseTest {
	WebDriver driver;
	protected static LandingPage landingPage;
	
	public WebDriver initializeDriver() {
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
		
	}

}
