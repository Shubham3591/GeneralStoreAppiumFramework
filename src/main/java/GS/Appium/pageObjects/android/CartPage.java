package GS.Appium.pageObjects.android;

import java.util.List;

import GS.Appium.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class CartPage extends AndroidActions {
	AndroidDriver driver;
	public CartPage(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	//driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"))
	@AndroidFindBy(id="com.androidsample.generalstore:id/productPrice")
	public List<WebElement> productList;
	
	//driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl"))
	@AndroidFindBy(id="com.androidsample.generalstore:id/totalAmountLbl")
	public WebElement totalAmount;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/termsButton")
	public WebElement terms;
	
	@AndroidFindBy(id="android:id/button1")
	public WebElement acceptButton;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnProceed")
	public WebElement proceed;
	
	@AndroidFindBy(className="android.widget.CheckBox")
	public WebElement checkBox;
	
	public List<WebElement> getProductList()
	{
		
		return productList;
	}
	

	
	public void acceptTermsConditions()
	{
		longPressAction(terms);
		acceptButton.click();
	}
	

	public void submitOrder()
	{
		checkBox.click();
		proceed.click();
	}
	
	
}
