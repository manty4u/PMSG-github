package pageObjects;

import org.openqa.selenium.WebElement;
import utility.Base;
import utility.Log;

public class PageCreateProject extends Base {

	public static WebElement element = null;
		
	public static WebElement txt_Name(int timeout){
		
		try {
			element = getElement(driver, "//input[@name='name']", timeout);			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}

	public static WebElement txt_StartDate(int timeout){
		
		try {
			element = getElement(driver, "//input[@name='schedule_start']", timeout);			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}
	
	public static WebElement txt_FinishDate(int timeout){
		
		try {
			element = getElement(driver, "//input[@name='schedule_finish']", timeout);			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}	
	
	public static WebElement lst_Class(int timeout){
		
		try {
			element = getElement(driver, "//select[contains(@name,'class')]", timeout);			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}	
	
	public static WebElement lst_GreenInnovation(int timeout){
		
		try {
			element = getElement(driver, "//select[contains(@name,'green_innovation')]", timeout);			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}		
	
	public static WebElement lst_Progress(int timeout){
		
		try {
			element = getElement(driver, "//select[contains(@name,'progress')]", timeout);			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}		
	
	public static WebElement btn_Save(int timeout){
		
		try {
			element = getElement(driver, "//*[@id='ppm_workspace_bb']//button[text()='Save']", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}	
	
	public static WebElement img_BrowseManager(int timeout){
		
		try {
			element = getElement(driver, "//img[@alt='Browse Manager']", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}

	public static WebElement img_BrowseBusinessOwner(int timeout){
		
		try {
			element = getElement(driver, "//img[@alt='Browse Business Owner']", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}
	
	public static WebElement img_BrowseOrganization(int timeout){
		
		try {
			element = getElement(driver, "//img[@alt='Browse Organization']", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}	
	
	public static WebElement img_BrowseDepartment(int timeout){
		
		try {
			element = getElement(driver, "//img[@alt='Browse Department']", timeout);
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}			

	public static WebElement txt_ResourceID(int timeout){
		
		try {
			element = getElement(driver, "//label[text()='Resource ID']/ancestor::tr[1]//input", timeout);			
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		
		} catch (Exception e) {	
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();				
			Log.error("Element not found : "+ methodName);					
			throw(e);
		}

			
		Log.info("Element Found : "+ methodName);	
		return element;
	}
	
	public static WebElement btn_AddOBSUnit(int timeout){
		
		try {
			element = getElement(driver, "//*[@id='ppm_dialog']//button[contains(text(),'Add')]", timeout);
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
