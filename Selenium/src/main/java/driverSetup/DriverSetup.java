package driverSetup;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	 public static WebDriver setupDriver() {

		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path del driver en el sistema
	    System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedad del .exe
	    WebDriver driver = new ChromeDriver();//Inicializando el driver
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
    
	 }
}
