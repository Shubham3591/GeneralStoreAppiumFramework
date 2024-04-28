package GS.Appium.testCases;

import GS.Appium.testUtils.AndroidBaseTest;
import io.appium.java_client.android.Activity;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class eCommerce_tc extends AndroidBaseTest {

	
	
/*	@BeforeMethod
	public void preSetup()
	{
		//screen to home page
		Activity activity = new Activity("com.androidsample.generalstore", "com.androidsample.generalstore.MainActivity");
		driver.startActivity(activity);

	}*/
	
	@Test
	public void FillForm_PositiveFlow() throws InterruptedException

	
	{
		formPage.setNameField("Shubham");

	}
}
