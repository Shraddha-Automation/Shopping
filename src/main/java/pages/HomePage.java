package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.*;

import Base.driver;
import Base.baseTest;

import org.openqa.selenium.support.PageFactory;

public class HomePage extends driver{
	PageObjects homePage;
	public HomePage() {
		super();
		homePage = new PageObjects();
		PageFactory.initElements(driver, homePage);
	}
	
	public void click_shop_by_category_button() { 
		homePage.ShopByCategorybtn.click();
	}
		
	class PageObjects{
		
		//Shop By category button
		@FindBy(id="in.amazon.mShop.android.shopping:id/web_home_shop_by_department_label")
		public WebElement ShopByCategorybtn;

			}
}




