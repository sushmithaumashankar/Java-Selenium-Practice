package highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Highlightfields {
	
	@Test
	public void highlight_text() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement username=driver.findElement(By.id("email"));
	WebElement password=driver.findElement(By.id("pass"));
	TextfieldHighlight.highLightElement(driver, username);
	username.sendKeys("sush@gmail.com");
	TextfieldHighlight.highLightElement(driver, password);
	password.sendKeys("12345");
	driver.close();
}
}
