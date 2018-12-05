package screenshots;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Screenshot2 {
	WebDriver driver;
	Utility uti=new Utility();
	@Test
	public void screesnhot2() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email123")).sendKeys("sushmithauy13@gmail.com");
	}

	@AfterMethod
	public void teardow(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			uti.capturescreenshot(driver, result.getName());
		}
		driver.close();
	}
	
}
