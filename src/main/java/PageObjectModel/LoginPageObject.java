package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	WebDriver Driver;

		private By username = By.xpath("//input[@id='username']");
		private By password = By.xpath("//input[@id='password']");
		private By login = By.xpath("//input[@id='Login']");
		public By tryforFree = By.xpath("//a[@id='signup_link']");
		private By error = By.xpath("//div[@id='error']");
		
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
