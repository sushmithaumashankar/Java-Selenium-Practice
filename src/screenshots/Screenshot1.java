package screenshots;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		Utility uti=new Utility();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		uti.capturescreenshot(driver, "browseropen");
		driver.findElement(By.id("email")).sendKeys("sushmithauy13@gmail.com");
		uti.capturescreenshot(driver, "browserclosing");
		driver.close();
	}

}
