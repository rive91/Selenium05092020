package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.loginPage;

public class TC_01_CorrecLogin {
	WebDriver driver = DriverSetup.setupDriver();

	// Login PageObject
	loginPage login = new loginPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_01_CorrectLogin() {
		login.login(variablesGlobales.USER_ADMIN, variablesGlobales.PASSWORD_ADMIN);
	}

	@AfterTest
	public void closeDriver() {
		driver.quit();

	}
}
