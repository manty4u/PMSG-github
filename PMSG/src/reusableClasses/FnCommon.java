package reusableClasses;

import org.openqa.selenium.WebElement;
import utility.Action;
import utility.Base;
import utility.Log;

public class FnCommon extends Base {
	
	public static void mouseHoverAndClick(WebElement element1,WebElement element2) throws Exception{
		
		try {
			Action.mouseHover(element1);
			Thread.sleep(2000);
			Action.click(element2);
			Log.info("Mousehovered and Clicked on required element");
		
		} catch (Exception e) {
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
			Log.error("Mousehovered and Clicked on required element is failed");
			reportingStepWithScreenshot("Fail", "Unable to mouse hovered and click", "");	
			Thread.sleep(10000);
			throw(e);
		}
	}

	public static void selectFromTableUsingSortableColumn(String strSortColumnName,String strValue) throws Exception{
		
		try {
			element = getFirstIndexElement(driver, "//th[@class='colHeadSort' and .//a[text()='"+ strSortColumnName +"']]", 5);
			String strColumnID = element.getAttribute("data-columnid");
			element = getElement(driver, "//td[@data-columnid='"+strColumnID+"' and text()='"+strValue+"']/ancestor::tr[1]//*[@type='radio' or @type='checkbox']", 5);
			Action.click(element);
			Log.info("Selected the row corresponding  " +strSortColumnName+" = " + strValue);
		
		} catch (Exception e) {
			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
			Log.error(methodName+"  failed: Could not select the row corresponding  " +strSortColumnName+" = " + strValue);
			reportingStepWithScreenshot("Fail", "Could not select the row corresponding  " +strSortColumnName+" = " + strValue, "");	
			Thread.sleep(10000);
			throw(e);
		}
		
	}

	public static void selectFromTableUsingTextColumn(String strSortColumnName,String strValue) throws Exception{
		
		try {
			element = getFirstIndexElement(driver, "//th[text()='"+strSortColumnName+"']", 5);
			String strColumnID = element.getAttribute("data-columnid");
			element = getElement(driver, "//td[@data-columnid='"+strColumnID+"' and text()='"+strValue+"']/ancestor::tr[1]//*[@type='radio' or @type='checkbox']", 5);
			Action.click(element);
			Log.info("Selected the row corresponding  " +strSortColumnName+" = " + strValue);
		
		} catch (Exception e) {
			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
			Log.error(methodName+"  failed: Could not select the row corresponding  " +strSortColumnName+" = " + strValue);
			reportingStepWithScreenshot("Fail", "Could not select the row corresponding  " +strSortColumnName+" = " + strValue, "");	
			Thread.sleep(10000);
			throw(e);
		}		
	}	
	
	
	public static void selectOBS(String strOBS) throws Exception{
		
		try {
						
			String[] subLevels = strOBS.split("/");
			
			for (int i = 0; i < subLevels.length; i++) {
				String strSubLevel = subLevels[i];
				
				if (i == subLevels.length-1) {
					

						element = getElement(driver, "//*[text()='"+strSubLevel+"']/ancestor::tr[1]//*[@type='radio']", 5);
			
				} else {
					
					element = getElement(driver, "//*[text()='"+strSubLevel+"']/ancestor::tr[1]//img", 5);
				}
				Action.click(element);
			}
	
			Log.info("Selected the OBS as:  " +strOBS);
			
		} catch (Exception e) {
			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
			Log.error(methodName + "  failed: Could not Select the OBS as:  " +strOBS );
			reportingStepWithScreenshot("Fail", "Could not select OBS unit as:  " +strOBS, "");	
			Thread.sleep(10000);
			throw(e);
		}
	}
	
	
}
