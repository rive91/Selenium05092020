package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test
  public void softAssertEquas() {
	  
	  int a = 5;
	  int b = 5;
	  int x = 5;
	  int y = 5;
	  
	  softAssert.assertEquals(a, b);
	  softAssert.assertEquals(x, y);
	  
	  softAssert.assertAll();

  }
  @Test
  public void softAssertDriver() {
	  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path del driver en el sistema
      System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedad del .exe
      WebDriver driver = new ChromeDriver();//Inicializando el driver
      driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome en la URL especificada
      driver.manage().window().maximize();//Maximizar Ventana
      
      String actualTitle = driver.getTitle();
      String expectedTitle = "OrangeHRM";
      String badTitle = "asd";
      
      softAssert.assertEquals(actualTitle, expectedTitle);
      softAssert.assertEquals(actualTitle, badTitle);
	  softAssert.assertAll();

  }
}
