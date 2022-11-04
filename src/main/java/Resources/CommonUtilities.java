package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	
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
}
