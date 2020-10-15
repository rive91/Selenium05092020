package loginTests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.loginPage;

public class TC_02_IncorrectLogin {
	
	WebDriver driver = DriverSetup.setupDriver();

	// Login PageObject
	loginPage login = new loginPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
	}
	
  @Test
  public void TC_02() {
	  boolean isIncorrect = login.loginIncorrect(variablesGlobales.USER_ADMIN, "badPassword");
	  Assert.assertTrue(isIncorrect);
  }
  
  @AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
