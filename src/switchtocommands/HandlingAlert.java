package switchtocommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingAlert {
	
	@Test
	public void alert() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
	Thread.sleep(2000);
	String msg=driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	String msg1="Please select start place.";
	Assert.assertEquals(msg, msg1);
	driver.close();
	}
}
