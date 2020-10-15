package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DirectoryPage {
	
	public DirectoryPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}
	
	//WebElements u objetos
	@FindBy(id="searchDirectory_emp_name_empName")
	private WebElement nameTxt;
	@FindBy(id="searchDirectory_job_title")
	private WebElement drpDwnJobtitle;
	@FindBy(id="searchDirectory_location")
	private WebElement drpDwnLocation;
	@FindBy(id="searchBtn")
	private WebElement searchBtn;
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")
	private WebElement searchResult;
	
	public void fillName(String user) {
		nameTxt.sendKeys(user);
	}
	
	public void selectJobTitle(String jobTitle) {
		Select drpDwn = new Select(drpDwnJobtitle);
		drpDwn.selectByVisibleText(jobTitle);
	}
	
	public void selectLocation(String location) {
		Select drpDwn = new Select(drpDwnLocation);
		drpDwn.selectByVisibleText(location);
	}
	
	public void clickSearch() {
		searchBtn.click();
	}
	
	public boolean verifySearchedName(String expectedName) {
		System.out.println(searchResult.getText());
		return searchResult.getText().contains(expectedName);
	}
}
