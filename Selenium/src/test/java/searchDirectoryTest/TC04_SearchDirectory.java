package searchDirectoryTest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.DashboardPage;
import navPages.DirectoryPage;
import navPages.loginPage;

public class TC04_SearchDirectory {
	WebDriver driver = DriverSetup.setupDriver();

	// Login PageObject
	loginPage login = new loginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);
	DirectoryPage directoryPage = new DirectoryPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_04() {
		
		String username = "Charlie Carter";
		login.login(variablesGlobales.USER_ADMIN, variablesGlobales.PASSWORD_ADMIN);
		
		dashboard.goMenuDirectory();
		
		directoryPage.fillName(username);
		
		directoryPage.selectJobTitle("QA Engineer");
		
		directoryPage.selectLocation("  United States");
		
		directoryPage.clickSearch();
		
		boolean isNameCorrect = directoryPage.verifySearchedName(username);
		
		Assert.assertTrue(isNameCorrect);
		
	}

	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
