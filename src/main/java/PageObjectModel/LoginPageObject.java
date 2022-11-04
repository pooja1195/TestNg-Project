package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	WebDriver Driver;

		By username = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		By login = By.xpath("//input[@id='Login']");
		By tryforFree = By.xpath("//a[@id='signup_link']");
		By error = By.xpath("//div[@id='error']");
		
		public LoginPageObject(WebDriver driver2) {
			// TODO Auto-generated constructor stub
			Driver = driver2;
		}
		public WebElement typeusername() {
			return Driver.findElement(username);
		}
		public WebElement typepassword() {
			return Driver.findElement(password);
		}
		public WebElement clickonLogin() {
			return Driver.findElement(login);
		}
		public WebElement TryforFree() {
			return Driver.findElement(tryforFree);
		}
		public WebElement Loginerror() {
			return Driver.findElement(error);
		}
	
}
