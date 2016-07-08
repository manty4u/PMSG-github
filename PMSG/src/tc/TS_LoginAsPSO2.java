package tc;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import envFiles.*;
import reusableClasses.*;
import utility.*;

public class TS_LoginAsPSO2 extends Base{
	
	@BeforeMethod
	public void openBrowser() throws Throwable{
		System.out.println("BeforeMethod2");
		strTCName = getTestCaseName(this.toString());
		configureReporterLog();
		
		logger
			.assignAuthor("Saurav")
			.assignCategory("E2E");		
		
		Excel.excel(Constant.strDataSheetPath,"demo");
	}
	
	@Test
	public void testCase2() throws Throwable{
		
		EnvironmentSetUp.setUserCredentials("PSO_SRC");
		FnLogin.loginToClarity();
		Thread.sleep(10000);
		reportingStep("info", "User should be logged into Clarity", "Logged in succesfully");
		reportingStep("info", "Title should contain PPIM", "");
		Assert.assertTrue(driver.getTitle().contains("PPIM"));
		generateReport();
	}
		
}




