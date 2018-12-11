package Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
//import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;


public class baseTest {
	private final static String APP_PACKAGE_NAME = "in.amazon.mShop.android.shopping";
	private final static String APP_ACTIVITY_NAME = "com.amazon.mShop.splashscreen.StartupActivity";
	private final static String Device_Name= "Redmi";
	protected static AndroidDriver androidDriver=null;

	@BeforeClass
	public void setup(){
		initDriver();
	}

	public AndroidDriver getDriver() {

		return androidDriver;
	}
	/**
	 * Method for wait for Page load
	 * @param element
	 */
	public static void waitForPageLoad(By element) {
		try {
			WebDriverWait wait=new WebDriverWait(androidDriver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void initDriver(){
		System.out.println("inside init method");
		DesiredCapabilities capabilities = DesiredCapabilities.android(); 
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Device_Name);
		capabilities.setCapability("browserName", "");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);

		//AndroidDriver driver = null;
		try {
			androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		

	}

	
}







