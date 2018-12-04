package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datapicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> data=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
		int count=data.size();
		for(int i=0;i<count;i++) {
			String text=data.get(i).getText();
			if(text.equalsIgnoreCase("28")) {
				data.get(i).click();
				break;
				
			}
		}
		Thread.sleep(3000);
		driver.close();
	}

}
