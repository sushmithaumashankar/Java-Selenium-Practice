package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionEvents {
	
	@Test
	public void actevents() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	WebElement ele=driver.findElement(By.xpath("//*[@id='fromPlaceName']"));
	action.moveToElement(ele).build().perform();
	String ele1=ele.getAttribute("title");
	System.out.println(ele1);
	Thread.sleep(3000);
	driver.close();
	
	}
}
