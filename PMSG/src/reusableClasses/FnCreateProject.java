package reusableClasses;

import pageObjects.PageCommon;
import pageObjects.PageCreateProject;
import pageObjects.PageSelectProjectTemplate;
import utility.Action;
import utility.Base;
import utility.Log;

public class FnCreateProject extends Base{

	public static void selectProjTemplate(String strTemplateName) throws Exception{
		
		try {
			reportingStep("info", strTemplateName + "Should be selected", "");
			Action.click(PageCommon.img_ExpandFilter(10));
			Action.enter(PageSelectProjectTemplate.txt_ProjectName(2), strTemplateName);
			Action.click(PageCommon.btn_Filter(2));
			Thread.sleep(5000);
			Action.click(PageSelectProjectTemplate.rbtn_SelectProjTemplate(strTemplateName, 2));
			
			Log.info("Selected the template as: "+strTemplateName);
			reportingStepWithScreenshot("Pass", "", "");
			
		} catch (Exception e) {
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
			Log.error(methodName+" failed : Failed to select template as: "+ strTemplateName);
			reportingStepWithScreenshot("Fail", strTemplateName + "Should be selected", "Failed to Select");	
			Thread.sleep(10000);
			throw(e);
		}
	}
	
	public static void fillParameters(String strName,String strManager,String strClass,String strStartDate,String strFinishDate,String strBusinessOwner,String strOrganization,String strDepartment,String strGreenInnovation,String strProgress ) throws Throwable{
		try {
			Action.enter(PageCreateProject.txt_Name(10), strName);
			Action.selectbyValue(PageCreateProject.lst_Class(2), strClass);
			Action.enter(PageCreateProject.txt_StartDate(2), strStartDate);
			Action.enter(PageCreateProject.txt_FinishDate(2), strFinishDate);
			Action.selectbyValue(PageCreateProject.lst_GreenInnovation(2), strGreenInnovation);
			Action.selectbyValue(PageCreateProject.lst_Progress(2), strProgress);
			Action.click(PageCreateProject.img_BrowseBusinessOwner(2));
			FnCommon.selectOBS(strBusinessOwner);
			Action.click(PageCreateProject.btn_AddOBSUnit(2));
			Thread.sleep(2000);
			Action.click(PageCreateProject.img_BrowseOrganization(2));
			FnCommon.selectOBS(strOrganization);
			Action.click(PageCreateProject.btn_AddOBSUnit(2));
			Thread.sleep(2000);
			Action.click(PageCreateProject.img_BrowseDepartment(2));
			FnCommon.selectOBS(strDepartment);
			Action.click(PageCreateProject.btn_AddOBSUnit(2));
			Thread.sleep(2000);
			
			Log.info("All parameters are filled in Create project page");
			
		} catch (Exception e) {
			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
			Log.error(methodName + " failed: Failed to fill all parameters in project creation page");
			reportingStepWithScreenshot("Fail", "Failed to fill all parameters in project creation page", "");	
			Thread.sleep(10000);
			throw(e);
		}
		
		
	}
}
