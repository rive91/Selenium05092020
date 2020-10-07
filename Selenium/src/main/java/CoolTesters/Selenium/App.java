package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	 String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path del driver en el sistema
         System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedad del .exe
         WebDriver driver = new ChromeDriver();//Inicializando el driver
         driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome en la URL especificada
         driver.manage().window().maximize();//Maximizar Ventana
         
         //Obteniendo objetos/elementos de la pagina del login
         WebElement txtUserName = driver.findElement(By.id("txtUsername"));
         WebElement txtPassword = driver.findElement(By.id("txtPassword"));
         WebElement btnLogin = driver.findElement(By.id("btnLogin"));
         String forgotPwdMsj = driver.findElement(By.xpath("//*[@id='forgotPasswordLink']/a")).getText();

         
         //Haciendo login
         txtUserName.sendKeys("Admin");
         Thread.sleep(1000);
         txtPassword.sendKeys("admin123");
         Thread.sleep(1000);
         btnLogin.click();
         Thread.sleep(2000);
         
         //Validacion de Home Page
         String urlDashboard = driver.getCurrentUrl();
         System.out.println("URL: " + urlDashboard);
         urlDashboard.contains("/dashboard");//Verificando que la URL contenga /dashboard
         
         //FindElements
         List<WebElement> firstLevelMenu = driver.findElements(By.xpath("//*[@class='firstLevelMenu']/b"));
         
         System.out.println("Numer de elementos: " + firstLevelMenu.size());
         
         String primerMenu = firstLevelMenu.get(0).getText();
         System.out.println(primerMenu);
         String segundoMenu = firstLevelMenu.get(1).getText();
         System.out.println(segundoMenu);
         
         for (int i = 0; i<firstLevelMenu.size();i++) {
        	 System.out.println("Los menus son: " + firstLevelMenu.get(i).getText());
         }

         
         
         //Metodos de navegacion
//         driver.navigate().back();
//         Thread.sleep(3000);
//         driver.navigate().forward();
//         Thread.sleep(3000);
//         driver.navigate().refresh();
//         Thread.sleep(3000);
         
//         String title = driver.getTitle();
//         System.out.println("Title is: " + title);
//         
//         //Click assignLeaveBtn
//         WebElement assignLeaveBtn = driver.findElement(By.className("quickLinkText"));
//         assignLeaveBtn.click();
//         Thread.sleep(3000);
//         
//         //Obtener Text de un webElement
//         String welcomeMsj = driver.findElement(By.id("welcome")).getText();
//         boolean verifyWelcomeMsj = welcomeMsj.contains("Smith");
//         if(verifyWelcomeMsj) {
//        	 System.out.println("El mensaje contiene el nombre de Smith");
//         }else {
//        	 System.out.println("ERROR el mensaje NO contiene el nombre esperado");
//         }
//         
//         //Dropdowns
//         Select leaveTypeDrpDwn = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
//         leaveTypeDrpDwn.selectByVisibleText("Maternity US");
         
         //Cerrar Navegador Web
//         driver.close();//Cierra la ventana actual
//         driver.quit();//Cierra todas las ventanas creadas por el webDriver
    }
}
