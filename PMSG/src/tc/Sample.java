package tc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void sample(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.virtual.philips.com");
		String str = "user";
		driver.findElement(By.xpath("//input[@id='Enter "+ str +" name']")).sendKeys("saurav");
		
String strOBS = "Concern Product Tree/Health Systems/Sleep & Respiratory Care/Sleep and Respiratory Care/Oxygen";
		
		String[] subLevels = strOBS.split("/");
		
		for(int i=0;i<subLevels.length;i++)
		{
		    System.out.println(subLevels[i]);
		}
	
	}

}
