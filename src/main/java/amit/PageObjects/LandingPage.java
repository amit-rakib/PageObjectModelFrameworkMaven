package amit.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LandingPage {

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		//initialization
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement login;
	
	//159 video
	
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client/");
	}
	
	public void loginApplication(String email, String pass) {
		userEmail.sendKeys(email);
		password.sendKeys(pass);
		login.click();
	}
	
	
	
}
