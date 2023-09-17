package PageObjectModel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage {
	public AndroidDriver driver;
	
	
	@CacheLookup
	@AndroidFindBy(xpath ="in.amazon.mShop.android.shopping:id/continue_button")
	private WebElement languagebutton;
	@AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"தமிழைத் தேர்ந்தெடு\"]")
	private WebElement tamillanguagebutton;
	@AndroidFindBy (id = "in.amazon.mShop.android.shopping:id/skip_sign_in_button")
	private WebElement SkipID;

	//@AndroidFindBy (xpath="//android.widget.TextView[@content-desc=\"Amazon\"]")
	//private WebElement Amazon;
	
	public LoginPage (AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	By langu= By.xpath("//android.widget.Button [@text = 'Continue in English']");
	By Skip = By.id("in.amazon.mShop.android.shopping:id/skip_sign_in_button");
	
	public void languagebutton(AndroidDriver driver ) {
		
	if (langu.equals(langu)) {
		languagebutton.click();
	}
	else {
		tamillanguagebutton.click();
	}
		if(Skip.equals(Skip)) {
			
			SkipID.click();
			
		}
		
	}
	

	
	}
		
	

