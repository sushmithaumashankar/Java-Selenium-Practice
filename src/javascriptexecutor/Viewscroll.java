package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Viewscroll {

	@Test
	public void scrollview() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement element=driver.findElement(By.xpath("//*[@id='pageFooter']/div[3]/div/span"));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(2000);
		System.out.println(element.getText());
		driver.close();
	}
}
