package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
	
	WebDriver Driver;
	By firstname= By.xpath("//input[@name='UserFirstName']");
	By lastname = By.xpath("//input[@name='UserLastName']");
	By email = By.xpath("//input[@name='UserEmail']");
	By employees = By.xpath("//select[@name='CompanyEmployees']");
	By country = By.xpath("//select[@name='CompanyCountry']");
	By TnC = By.xpath("(//div[@class='checkbox-ui'])[1]");
	By trial = By.xpath("//button[@name='start my free trial']");
	
	public SignupPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		Driver=driver2;
	}
	public WebElement Firstname() {
		return Driver.findElement(firstname);
	}
	public WebElement Lastname() {
		return Driver.findElement(lastname);
	}
	public WebElement Email() {
		return Driver.findElement(email);
	}
	public WebElement Employee() {
		return Driver.findElement(employees);
	}
	public WebElement Country() {
		return Driver.findElement(country);
	}
	public WebElement Terms() {
		return Driver.findElement(TnC);
	}
	public WebElement FreeTrial() {
		return Driver.findElement(trial);
	}
	
}
