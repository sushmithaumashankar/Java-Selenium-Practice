package dropdowndemo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Dropdown2 {

	public void select_dropdown2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement month_id = driver.findElement(By.xpath("//*[@id='month']"));
		Select month = new Select(month_id);
		Thread.sleep(2000);
		List<WebElement> ele1 = month.getOptions();
		int ele2 = ele1.size();
		Assert.assertEquals(ele2, 13);
		System.out.println("The size is " + ele2);
		for (WebElement ele : ele1) {
			String ele3 = ele.getText();
			System.out.println("The months are " + ele3);
		}

		Thread.sleep(1000);
		driver.quit();
	}

}
