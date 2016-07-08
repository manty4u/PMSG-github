package pageObjects;

import org.openqa.selenium.WebElement;
import utility.Base;
import utility.Log;

public class PageSelectProjectTemplate extends Base {

	public static WebElement element = null;
		
	public static WebElement txt_ProjectName(int timeout){
		
		try {
			element = getElement(driver, "//label[text()='Project Name']/ancestor::tr[1]//input", timeout);			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}
	
	public static WebElement rbtn_SelectProjTemplate(String strTemplateName,int timeout){
		
		try {
			element = getElement(driver, "//input[@title='"+ strTemplateName +"']", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}
	
	public static WebElement btn_Next(int timeout){
		
		try {
			element = getElement(driver, "//img[@alt='Next']/ancestor::button[1]", timeout);
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
