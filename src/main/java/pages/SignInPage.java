package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.*;

import org.openqa.selenium.support.PageFactory;

import Base.baseTest;
import Base.driver;

public class SignInPage extends driver{
	PageObjects signInPage;
	public SignInPage() {
		super();
		signInPage = new PageObjects();
		PageFactory.initElements(driver, signInPage);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void click_skip_button() { 
		signInPage.skipSignInbtn.click();
	}
	public void click_sign_in_to_account_button() { 
		signInPage.signInbtn.click();
	}
	public void click_already_a_customer() { 
		signInPage.AlreadyACustomerbtn.click();
	}
	public void click_new_user_button() { 
		signInPage.NewUserbtn.click();
	}
	
	class PageObjects{

		//Sign in to your account
		@FindBy(id = "in.amazon.mShop.android.shopping:id/signin_to_yourAccount")
		public WebElement signInbtn;

		//Skip Sign In Button
		@FindBy(id="in.amazon.mShop.android.shopping:id/skip_sign_in_button")
		public WebElement skipSignInbtn;

		//Already a Customer
		@FindBy(id="in.amazon.mShop.android.shopping:id/sign_in_button")
		public WebElement AlreadyACustomerbtn;

		//New User
		@FindBy(id="in.amazon.mShop.android.shopping:id/new_user")
		public WebElement NewUserbtn;
	}
}




