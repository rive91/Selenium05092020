package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void assertEquals() {
	  int a = 10;
	  int b = 10;
	  Assert.assertEquals(a,b,"Los Numeros no son Iguales");
  }
  
  @Test
  public void assertNoEquals() {
	  int a = 10;
	  int b = 10;
	  Assert.assertNotEquals(a, b , "Los numeros iguales");
  }
  
  @Test
  public void assertTrue() {
	  int a = 10;
	  int b = 10;
	
	  Assert.assertTrue(a==b);
  }
  
  @Test
  public void assertfalse() {
	  int a = 10;
	  int b = 5;
	  Assert.assertFalse(a==b);
  }
  
  @Test
  public void verificarTituloDePagina() {
	  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path del driver en el sistema
      System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedad del .exe
      WebDriver driver = new ChromeDriver();//Inicializando el driver
      driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome en la URL especificada
      driver.manage().window().maximize();//Maximizar Ventana
      
      String actualTitle = driver.getTitle();
      String expectedTitle = "OrangeHRM";
      
      Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @Test
  public void verificarTituloDePaginaBoolean() {
	  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path del driver en el sistema
      System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedad del .exe
      WebDriver driver = new ChromeDriver();//Inicializando el driver
      driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome en la URL especificada
      driver.manage().window().maximize();//Maximizar Ventana
      
      String actualTitle = driver.getTitle();
      String expectedTitle = "OrangeHRM";
      
      boolean titulo = actualTitle.contains(expectedTitle);
      
      Assert.assertTrue(titulo);
  }
}
