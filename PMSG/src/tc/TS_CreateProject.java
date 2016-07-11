package tc;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import envFiles.*;
import pageObjects.*;
import reusableClasses.*;
import utility.*;

public class TS_CreateProject  extends Base {

	
	@BeforeMethod
	public void initializeTest() throws Throwable{
		System.out.println("BeforeMethod2");
		strTCName = getTestCaseName(this.toString());
		configureReporterLog();

		logger
			.assignAuthor("Saurav")
			.assignCategory("E2E");		
	
		Excel.excel(Constant.strDataSheetPath,"createProject");
	}
	

	@Test
	public void testCase() throws Throwable{

		EnvironmentSetUp.setUserCredentials(xValue("LoginUser"));
		FnLogin.loginToClarity();
		FnHome.navigateTo("Home", "Investment");
		reportingStep("info", "Should click on button New from template", "");
		Action.click(PageInvestments.btn_NewFromTemplate(20));
		Thread.sleep(5000);
		reportingStepWithScreenshot("pass", "", "");
		FnCreateProject.selectProjTemplate(xValue("TemplateName"));
		reportingStep("info", "Should click on Next button", "");
		Action.click(PageSelectProjectTemplate.btn_Next(20));
		Thread.sleep(7000);
		reportingStepWithScreenshot("pass", "", "");
		reportingStep("info", "Should fill All parameters in Create project page", "");
		FnCreateProject.fillParameters(xValue("ProjectName"),xValue("ManagerID"),xValue("Class"),xValue("StartDate"),xValue("FinishDate"),xValue("BusinessOwner"),xValue("Organization"),xValue("Department"),xValue("GreenInnovation"),xValue("Progress"));
		reportingStepWithScreenshot("pass", "", "");
		reportingStep("info", "Should click on save button", "");
		Action.click(PageCreateProject.btn_Save(20));
		Thread.sleep(10000);
		reportingStepWithScreenshot("pass", "", "");
	
	}
	
}
