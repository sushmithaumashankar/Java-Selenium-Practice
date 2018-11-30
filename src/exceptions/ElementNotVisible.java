package exceptions;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementNotVisible {

	@Test
	public void notvisible() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		try {
			driver.findElement(By.xpath("//button/h1")).click();
		}catch(NoSuchElementException  e) {
		System.out.println(e.getMessage());
		}
		driver.findElement(By.id("email")).sendKeys("sushmithau13@gmail.com");
		driver.close();
	}

}
