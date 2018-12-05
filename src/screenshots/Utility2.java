package screenshots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility2 {

	public void capturescreenshot(WebDriver driver,String screenshotName) {
		try {
			TakesScreenshot scr=(TakesScreenshot)driver;
			File source=scr.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
		} catch (Exception e) {
			System.out.println("Something went wrong "+e.getMessage());
		}

	}

}
