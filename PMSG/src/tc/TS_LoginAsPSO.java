package tc;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import envFiles.*;
import reusableClasses.*;
import utility.*;


public class TS_LoginAsPSO extends Base {
	
	@BeforeMethod
	public void initializeTest() throws Throwable{
		
		System.out.println("BeforeMethod");
		strTCName = getTestCaseName(this.toString());
		configureReporterLog();
		
		logger
			.assignAuthor("Saurav")
			.assignCategory("E2E");		
		
		Excel.excel(Constant.strDataSheetPath,"demo");
	}
	

	@Test
	public void testCase() throws Throwable{

		System.out.println("started test1");
		EnvironmentSetUp.setUserCredentials(xValue("LoginUser"));
		FnLogin.loginToClarity();
		Log.info("Logged into Clarity successful");
		reportingStep("pass", "User should be logged into Clarity", "Logged in succesfully");
		reportingStep("info", "Title should contain PPM", "");	
		Assert.assertTrue(driver.getTitle().contains("PPM"));
	}
	
}
