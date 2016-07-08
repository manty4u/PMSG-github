package pageObjects;

import org.openqa.selenium.WebElement;
import utility.Base;
import utility.Log;

public class PageHome extends Base {

	public static WebElement element = null;
		
	public static WebElement ele_Home(int timeout){
		
		try {
			element = getElement(driver, "//span[@alt='Home']", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}
	
	public static WebElement lnk_Investments(int timeout){
		
		try {
			element = getElement(driver, "//a[text()='Investments' and ..//div[text()='Portfolio Management']]", timeout);
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
