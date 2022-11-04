package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.Baseclass;

public class VerifyLogin extends Baseclass{
// import base class as it's outside the package
	@Test
	public void loginpage() throws IOException, InterruptedException {
		initializeDriver();
		Driver.get("https://login.salesforce.com/");
		
		LoginPageObject LPO = new LoginPageObject(Driver);
		LPO.typeusername().sendKeys("Test");
		LPO.typepassword().sendKeys("Test12345");
		LPO.clickonLogin().click();
		Thread.sleep(2000);
		LPO.TryforFree().click();
		
		
	}
}
