package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabsEjemplo {

	public static void main(String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path del driver en el sistema
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedad del .exe
        WebDriver driver = new ChromeDriver();//Inicializando el driver
        driver.get("http://demo.guru99.com/popup.php");//Iniciar chrome en la URL especificada
        driver.manage().window().maximize();//Maximizar Ventana
        
        //Obtener e imprimir el ID de la ventana/Tab original
        String originalTab = driver.getWindowHandle();
        System.out.println(originalTab);
        
        //Click en el link que abre otra ventana
        WebElement clickHere = driver.findElement(By.xpath("//*[contains(@href, 'popup.php')]"));
        clickHere.click();
        
        Set<String> ventanasAbiertas = driver.getWindowHandles();//Set es una utileria de Java guardar 
        														 //una lista sin duplicados
        System.out.println(ventanasAbiertas);
        
        for (String tabNueva : driver.getWindowHandles()) {//Estructura FOR simplificado
        	if(!originalTab.contentEquals(tabNueva)) { //el operador booleano "!" verifica que el contentEquals sea Falso
        		driver.switchTo().window(tabNueva);
        		break;
        	}
        }
        
        //Escribir el email en la nueva ventana
        WebElement emailTxt = driver.findElement(By.name("emailid"));
        emailTxt.sendKeys("test@test.com");
        
        //regresar ala ventana original
        driver.switchTo().window(originalTab);

	}

}
