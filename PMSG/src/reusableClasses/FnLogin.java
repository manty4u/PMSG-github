package reusableClasses;

import org.testng.Assert;

import envFiles.EnvironmentSetUp;
import pageObjects.PageLogin;
import utility.Action;
import utility.Base;
import utility.Log;

public class FnLogin extends Base {
	
	public static void loginToClarity() throws Throwable{
		try {
/*			PageLogin.txt_Username(5).sendKeys(username);			
			PageLogin.txt_Password(20).sendKeys(password);
			PageLogin.btn_SignIn(20).click();	*/
			Action.enter(PageLogin.txt_Username(20), EnvironmentSetUp.strUserName);
			Action.enter(PageLogin.txt_Password(5), EnvironmentSetUp.strPassword);
			Action.click(PageLogin.btn_SignIn(5));
			Thread.sleep(10000);
			Assert.assertTrue(driver.getTitle().contains("CA PPM"));
			Log.info("Method Passed : loginToClarity");
			reportingStepWithScreenshot("Pass", "Logged into Clarity", "Success");
				
			//			throw(new NullPointerException());			
			
		} catch (Exception e) {
			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
			reportingStepWithScreenshot("Fail", "Login to Clarity", "Failed to login");	
			throw(e);
		}
		
		
	}

}
