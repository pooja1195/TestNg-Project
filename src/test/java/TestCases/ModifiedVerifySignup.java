package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignupPageObject;
import Resources.ModifiedBaseclass;
import Resources.TestData;

public class ModifiedVerifySignup extends ModifiedBaseclass{
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
		Select s = new Select(SPO.Employee());
		s.selectByIndex(1);
		
		SPO.Country().click();
		Select s1 = new Select(SPO.Country());
		s1.selectByIndex(1);
//		SPO.Country().clear();
//		s1.selectByValue("India"); //is not working
		
		SPO.Terms().click();
		SPO.FreeTrial().click();
	}
}
