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
				
		SignupPageObject SPO = new SignupPageObject(Driver);
		CommonUtilities.handleExplicitwait(30, SPO.firstname);//Explicit Wait
		
		SPO.Firstname().sendKeys(TestData.firstname);
		SPO.Lastname().sendKeys(TestData.lastname);
		SPO.Email().sendKeys(TestData.email);
		
		SPO.Employee().click();
		CommonUtilities.handleStaticDropdown(SPO.Employee(), 1);
		
		SPO.Country().click();
		CommonUtilities.handleStaticDropdown(SPO.Country(), 1);
		SPO.Country().clear();
		CommonUtilities.handleStaticDDByValue(SPO.Country(), "AR");
		
		SPO.Terms().click();
		SPO.FreeTrial().click();
	}
}
