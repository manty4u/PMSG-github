package reusableClasses;

import pageObjects.PageHome;
import utility.Base;
import utility.Log;

public class FnHome extends Base{
	
	public static void navigateTo(String str1,String str2) throws Exception{
		
		try {
			switch (str1.toLowerCase()) {
			case "home":
				
				switch (str2.toLowerCase()) {
				case "investment":
					FnCommon.mouseHoverAndClick(PageHome.ele_Home(15),PageHome.lnk_Investments(10));
					break;

				default:
					break;
				}
				
				break;

			default:
				break;
			}
			
			Log.info("Mouse hovered on "+str1+"> Clicked on "+str2);
			Thread.sleep(10000);
			reportingStepWithScreenshot("Pass", "Mouse hovered on "+str1+"> Clicked on "+str2, "Success");
		} catch (Exception e) {
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
			reportingStepWithScreenshot("Fail", "Method failed:"+ methodName, "");	
			throw(e);
		}
	}

	
	
}
