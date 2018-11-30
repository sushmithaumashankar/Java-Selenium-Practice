package xpathAndCss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CssSelector {
	
	
	@Test
	public void cssselectorDemo() throws InterruptedException {
		System.setProperty("webdriver.ie.driver" ,"C:\\Users\\sushmitha\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.cssSelector("input[id='email']"));
		ele.sendKeys("sushmithau13@gmail.com");
		WebElement ele1=driver.findElement(By.cssSelector("input[class='inputtext'][id='pass']"));
		ele1.sendKeys("1234");
		WebElement ele2=driver.findElement(By.cssSelector("#u_0_j"));
		ele2.sendKeys("Sushmitha");
		WebElement ele3=driver.findElement(By.cssSelector("button[name*='web']"));
		ele3.click();
		Thread.sleep(3000);
		driver.close();
	}

}
