package pageObjects;

import org.openqa.selenium.WebElement;
import utility.Base;
import utility.Log;

public class PageCommon extends Base {

	public static WebElement element = null;
		
	public static WebElement img_ExpandFilter(int timeout){
		
		try {
			element = getElement(driver, "//span[contains(text(),'Filter:')]/preceding-sibling::img[@alt='Expand Filter']", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}

	public static WebElement btn_Filter(int timeout){
		
		try {
			element = getElement(driver, "//div[@class='ppm_filter_section']//button[text()='Filter']", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}	
	
	public static WebElement btn_Filter2(int timeout){
		
		try {
			element = getElement(driver, "(//div[@class='ppm_filter_section'])[2]//button[text()='Filter']", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}
	
	public static WebElement btn_ShowAll(int timeout){
		
		try {
			element = getElement(driver, "//div[@class='ppm_filter_section']//button[text()='Show All']", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}	

	public static WebElement btn_Clear(int timeout){
		
		try {
			element = getElement(driver, "//div[@class='ppm_filter_section']//button[text()='Clear']", timeout);
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
