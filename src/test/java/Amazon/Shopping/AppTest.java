package Amazon.Shopping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import Base.baseTest;
import pages.HomePage;
import pages.ShopByCategory;
import pages.SignInPage;

public class AppTest extends baseTest  {
		
	
	
	@Test
	public void loginTest() throws InterruptedException{

		SignInPage signInPage = new SignInPage();
		HomePage homePage= new HomePage();
		ShopByCategory shopByCategory= new ShopByCategory();
		signInPage.click_skip_button();
		homePage.click_shop_by_category_button();
		Thread.sleep(5000);
		shopByCategory.clickOnKindleReaderandEbooks();
		Thread.sleep(5000);
		shopByCategory.clickOnKindle(); 
		Thread.sleep(5000);
		shopByCategory.verifyKindle();
		
	}
		
	}







// report.step("Launched TestProject Demo app", loginPage.isDisplayed());

//return LoginPage.PASSED;

