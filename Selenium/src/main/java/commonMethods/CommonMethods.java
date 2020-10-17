package commonMethods;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods {
	
	public static void takeScreenshot(WebDriver webdriver, String testCaseName) {
		
		//Tomar el Screenshot de la pagina actual
		File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		//Setear la ruta para guardar el screenshot
		String screenShotPath = Paths.get("").toAbsolutePath().toString() + File.separator + "test-output" + File.separator + testCaseName;
		
		try {
			FileHandler.createDir(new File(screenShotPath));//Creando Folder
			FileHandler.copy(scrFile, new File(screenShotPath + File.separator + "evidencia.png"));
		}catch (IOException e){ 
			e.printStackTrace();
		}
	}

}
