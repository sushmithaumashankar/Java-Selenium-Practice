package wait;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWait {
	
	@Test
	public void fluentwait() {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();

//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
// 
//       .withTimeout(60, TimeUnit.SECONDS)
// 
//       .pollingEvery(2, SECONDS)
// 
//       .ignoring(NoSuchElementException.class);
// 
// 
// 
//   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
// 
//     public WebElement apply(WebDriver driver) {
// 
//       return driver.findElement(By.id("foo"));
 
//     }
// 
//   });



	}

}
