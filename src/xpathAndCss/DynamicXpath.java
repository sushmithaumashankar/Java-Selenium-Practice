package xpathAndCss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicXpath {
	
	@Test
	public void dynamicxp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.xpath("//label[text()='Email or Phone']/following::input[1]"));
		ele1.sendKeys("sushmitha@gmail.com");
		ele1.clear();
		Thread.sleep(3000);
		WebElement ele2=driver.findElement(By.xpath("//input[@id='pass']/preceding::input[1]"));
		ele2.sendKeys("jkdghckwjdhk");
		driver.close();
		
	}
}
