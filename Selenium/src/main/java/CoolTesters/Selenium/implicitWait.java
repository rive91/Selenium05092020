package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitWait {

	public static void main(String[] args) {
		 String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path del driver en el sistema
         System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedad del .exe
         WebDriver driver = new ChromeDriver();//Inicializando el driver
         driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome en la URL especificada
         driver.manage().window().maximize();//Maximizar Ventana
         //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         //Obteniendo objetos/elementos de la pagina del login
//         WebElement txtUserName = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("txtUsername")));
//         txtUserName.sendKeys("test");
         
         //Esperar 20 segundos y que verifique cada 2 segundos
         Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        		 .withTimeout(Duration.ofSeconds(20))
        		 .pollingEvery(Duration.ofSeconds(2))
        		 .ignoring(NoSuchElementException.class);
         
         WebElement txtUsername = wait.until(new Function<WebDriver, WebElement>() {
        	 public WebElement apply(WebDriver driver) {
        		 driver.navigate().refresh();
        		 return driver.findElement(By.id("txtUserName"));
        	 }
         });
         
         txtUsername.sendKeys("test");

	}

}
