package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignupPageObject;
import Resources.CommonUtilities;
import Resources.ModifiedBaseclass;
import Resources.TestData;

public class CommonVerifySignup extends ModifiedBaseclass{
	@Test
	public void Signup() throws IOException, InterruptedException {
				
		LoginPageObject LPO = new LoginPageObject(Driver);
		LPO.TryforFree().click();
		
		Thread.sleep(3000);
		SignupPageObject SPO = new SignupPageObject(Driver);
		SPO.Firstname().sendKeys(TestData.firstname);
		SPO.Lastname().sendKeys(TestData.lastname);
		SPO.Email().sendKeys(TestData.email);
		
		SPO.Employee().click();
		CommonUtilities.handleStaticDropdown(SPO.Employee(), 1);
		
		SPO.Country().click();
		CommonUtilities.handleStaticDropdown(SPO.Country(), 1);
//		SPO.Country().clear();
//		s1.selectByValue("India"); //is not working
		
		SPO.Terms().click();
		SPO.FreeTrial().click();
	}
}
