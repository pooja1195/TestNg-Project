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
		
		
/*Explicit Wait		
		WebDriverWait wb=new WebDriverWait(Driver,Duration.ofSeconds(50));
		wb.until(ExpectedConditions.visibilityOfElementLocated(LPO.tryforFree));*/
		
		Thread.sleep(3000);
		LPO.TryforFree().click();
		Assertion.assertAll();
		Driver.close();
	}
}
