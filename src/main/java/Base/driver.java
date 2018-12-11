package Base;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class driver extends baseTest {
	
	protected AndroidDriver driver;
	public driver(){
		System.out.println("inside driver factory");
		this.driver = super.getDriver();
		System.out.println("inside driver factory2");
}
}	
