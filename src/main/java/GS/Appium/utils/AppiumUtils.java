package GS.Appium.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public abstract class AppiumUtils {

	public AppiumDriverLocalService service;

	public AppiumDriverLocalService startAppiumServer(String ipAddress,int port)
	{
		 service = new AppiumServiceBuilder().withAppiumJS(new File("C:/Users/carpr/AppData/Roaming/npm/node_modules/appium/lib/main.js"))
					.withIPAddress(ipAddress).usingPort(port).build();
				service.start();
				return service;
	}
	
	
	public void waitForElementToAppear(WebElement ele, AppiumDriver driver)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains((ele),"text" , "Cart"));
	}
	
}
