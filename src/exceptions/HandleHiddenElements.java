package exceptions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
//		driver.findElement(By.name("lang")).click();
		List<WebElement> radio=driver.findElements(By.id("male"));
		for(int i=0;i<radio.size();i++) {
			int x=radio.get(i).getLocation().getY();
			if(x!=0) {
				radio.get(i).click();
				break;	
			}
		}
		Thread.sleep(2000);
		driver.close();
	}

}
