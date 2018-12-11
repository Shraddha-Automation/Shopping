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
//import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.*;
import Base.driver;
import Base.baseTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ShopByCategory extends driver{
	PageObjects shopByCategoryPage;
	public ShopByCategory() {
		super();
		shopByCategoryPage = new PageObjects();
		PageFactory.initElements(driver, shopByCategoryPage);
	}
	
	public void clickOnKindleReaderandEbooks() { 
		//baseTest.waitForPageLoad(shopByCategoryPage.KindleEReadersandEbooks);
		shopByCategoryPage.KindleEReadersandEbooks.click();
	}
	public void clickOnKindle(){
		shopByCategoryPage.KindleEReaders.click();
	}
	
	public void verifyKindle()
	{

		Assert.assertEquals("Kindle White Paper item is not displayed",shopByCategoryPage.KindleWhitePaper.isDisplayed());
	}

	class PageObjects{
		//Shop By category button
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View/android.view.View[3]")
		public WebElement EchoAndAlexa;


		//Kindle E-Reader and E-books
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View/android.view.View[3]")
		public WebElement KindleEReadersandEbooks;
		
		
		//Kindle E-Readers 
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View[3]")
		public WebElement KindleEReaders;
		
		//Kindle ByButton
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View")
		public WebElement KindleWhitePaper;

	}
}




