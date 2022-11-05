package Resources;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	public static WebDriver Driver;
	public static void handleAssertions(String actualerror, String expectederror1) {
	String actual = actualerror;
	String expected = expectederror1;
	
	SoftAssert Assertion = new SoftAssert();
	Assertion.assertEquals(actual, expected);
	
	Assertion.assertAll();
	}
	
	public static void handleStaticDropdown(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public static void handleStaticDDByValue(WebElement element, String value ) {
	Select s1 = new Select(element);
	s1.selectByValue(value);
	}
	
	public static void handleExplicitwait(int duration, By element) {
		WebDriverWait wb=new WebDriverWait(Driver,Duration.ofSeconds(duration));
		wb.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
}
