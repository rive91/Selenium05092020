package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.loginPage;

public class TC_05_LoginParameter {
	WebDriver driver = DriverSetup.setupDriver();

	// Login PageObject
	loginPage login = new loginPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
	}
	
	@Test
	@Parameters ({"user","password"})
	public void TC_05(String user, String password) {
		login.login(user, password);
	}


	@AfterTest
	public void closeDriver() {
		driver.quit();
	
	}
}
