package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public DashboardPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Dashboard page object
	@FindBy(id = "welcome")
	private WebElement welcomeDrpDwn;
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[2]/a")
	private WebElement logoutBtn;
	@FindBy(id="txtUsername")
	private WebElement userNameTxt;
	@FindBy(id="menu_directory_viewDirectory")
	private WebElement menuDirectory;
	
	public boolean logout() {
		welcomeDrpDwn.click();
		logoutBtn.click();
		boolean userNametxt = userNameTxt.isDisplayed();
		return userNametxt;
	}
	
	public void goMenuDirectory() {
		menuDirectory.click();
	}

}
