package PageObjectModel;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public AndroidDriver driver;
	
	public void basepage(AndroidDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);;
		
	}
	


}

