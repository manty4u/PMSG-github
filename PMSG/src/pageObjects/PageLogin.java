package pageObjects;

import org.openqa.selenium.WebElement;
import utility.Base;
import utility.Log;

public class PageLogin extends Base {

	public static WebElement element = null;
		
	public static WebElement txt_Username(int timeout){
		
		try {
			element = getElement(driver, "//input[contains(@name,'username')]", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}

	public static WebElement txt_Password(int timeout){
		
		try {
			element = getElement(driver, "//input[@type='password' and contains(@name,'pass')]", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		}catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}
		
		Log.info("Element Found : "+ methodName);
		return element;
	}
	
	public static WebElement btn_SignIn(int timeout){
		
		try {
			element = getElement(driver, "//input[@type='button' and contains(@value,'Sign in')]", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		}catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}
		
		Log.info("Element Found : "+ methodName);
		return element;
	}
	
	
}
