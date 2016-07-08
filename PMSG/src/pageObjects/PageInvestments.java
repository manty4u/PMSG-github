package pageObjects;

import org.openqa.selenium.WebElement;
import utility.Base;
import utility.Log;

public class PageInvestments extends Base {

	public static WebElement element = null;
		
	public static WebElement btn_NewFromTemplate(int timeout){
		
		try {
			element = getElement(driver, "//div[@id ='ppm_workspace_bb']//button[text()='New from Template']", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}
	
	

	
	
	
}
