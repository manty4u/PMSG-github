package envFiles;

import utility.Constant;

public class EnvironmentSetUp extends Constant{
	
	
	public static void environmentSetUp(){
		
		strBrowser = "firefox";	 /*change it to "chrome" or "ie" as required*/
		strChromeDriverPath = "H:\\I2M Selenium\\PMSG\\Browsers\\";
		strIEDriverPath = "H:\\I2M Selenium\\PMSG\\Browsers\\";
		
		strEnvironment = "Test";	/*Change it to Test or Acc or Prod  As you want it to be appeared in report*/
		strAppURL = "https://pww.tst.clarity.philips.com/login";   /*Test environment URL*/
//		strAppURL = "https://pww.acc.clarity.philips.com/login";   /*Acceptance environment URL*/
		
		strReportPath = "H:\\I2M Selenium\\Results\\PMSG_Reports.html";
		strScreenshotPath = "H:\\I2M Selenium\\Results\\PMSG_Screenshots\\";
		strDataSheetPath = System.getProperty("user.dir")+"\\Test Data\\testdata.xlsx";
	}

	
	/*User-Credentials*/
	
	public static final String strPSO_srcUID = "310224091";
	public static final String strPSO_srcPWD = "Decide@2016";
	
	/*Dynamic User-credentials*/
	public static String strUserName;
	public static String strPassword;
	
	public static void setUserCredentials(String strUser){
		
		switch (strUser.toLowerCase()) {
		case "pso_src":
			strUserName = strPSO_srcUID;
			strPassword = strPSO_srcPWD;
			break;

		default:
			break;
		}
	}

}

