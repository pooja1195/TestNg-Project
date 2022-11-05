package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.Baseclass;
import Resources.CommonUtilities;
import Resources.ModifiedBaseclass;
import Resources.TestData;

public class CommonVerifyLogin extends ModifiedBaseclass{
// import base class as it's outside the package
	@Test
	public void loginpage() throws IOException, InterruptedException {
		
		LoginPageObject LPO = new LoginPageObject(Driver);
		LPO.typeusername().sendKeys(TestData.username);
		LPO.typepassword().sendKeys(TestData.password);
		LPO.clickonLogin().click();
		
		CommonUtilities.handleAssertions(LPO.Loginerror().getText(), TestData.expectederror);
		Thread.sleep(4000);
	    
		LPO.TryforFree().click();
		
	}
}
