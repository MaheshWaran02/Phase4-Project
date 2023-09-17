package StepDefinition;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

	

	public static AndroidDriver driver;

	@Before 
	public void Setup() throws MalformedURLException  {

		URL url = new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		AndroidDriver driver = new AndroidDriver (url,capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		System.out.println(driver.getSessionId());
		
		
		//driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Select English\"]")).click();
		//driver.findElement(By.id("in.amazon.mShop.android.shopping:id/continue_button")).click();
		
		

	}

}
	/*@After
	public void teardown()
	{
		driver.quit();
	}
	}*/
