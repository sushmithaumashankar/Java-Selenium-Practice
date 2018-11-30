package switchtocommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframes {
	
	@Test
	public void iframe() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("C:\\Users\\sushmitha\\Desktop\\iframe.html");
		driver.manage().window().maximize();
		int count=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Count is "+count);
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.xpath("//*[@id='b-more']"));
		Thread.sleep(2000);
		driver.switchTo().frame(ele);
		ele.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Selenium Iframes']")).click();
		driver.close();
	}

}
