package loginTests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.DashboardPage;
import navPages.loginPage;

public class TC_03_Logout {
	
	WebDriver driver = DriverSetup.setupDriver();

	// Login PageObject
	loginPage login = new loginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
	}
	
  @Test
  public void TC_03() {
	  System.out.println("Step 1: Login to the App");
	  login.login(variablesGlobales.USER_ADMIN, variablesGlobales.PASSWORD_ADMIN);
	  
	  System.out.println("Step 2: Logout");
	  boolean dashboarPage = dashboard.logout();
	  Assert.assertTrue(dashboarPage);
	  
  }
  
  @AfterTest
 	public void closeDriver() {
 		driver.quit();
 	}
}
