package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.Baseclass;
import Resources.ModifiedBaseclass;
import Resources.TestData;

public class ModifiedVerifyLogin extends ModifiedBaseclass{
// import base class as it's outside the package
	@Test
	public void loginpage() throws IOException, InterruptedException {
		
		LoginPageObject LPO = new LoginPageObject(Driver);
		LPO.typeusername().sendKeys(TestData.username);
		LPO.typepassword().sendKeys(TestData.password);
		LPO.clickonLogin().click();
		
		String actual = LPO.Loginerror().getText();
		String expected = TestData.expectederror;
		
		SoftAssert Assertion = new SoftAssert();
		Assertion.assertEquals(actual, expected);
		
		Thread.sleep(2000);
		LPO.TryforFree().click();
		
		Assertion.assertAll();
		
	}
}
