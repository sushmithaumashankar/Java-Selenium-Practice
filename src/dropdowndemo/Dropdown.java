package dropdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class Dropdown {

	public void select_dropdown1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement month_dd = driver.findElement(By.xpath("//*[@id='month']"));
		Select month = new Select(month_dd);
		month.selectByIndex(1);
		Thread.sleep(2000);
		month.selectByValue("11");
		Thread.sleep(2000);
		month.selectByVisibleText("Mar");

		////////////////////////////////////////////////////////////////
		WebElement ele = month.getFirstSelectedOption();
		System.out.println("before selecting " + ele.getText());

		month.selectByVisibleText("Aug");
		WebElement ele1 = month.getFirstSelectedOption();
		System.out.println("After selecting " + ele1.getText());

		Thread.sleep(1000);
		driver.quit();
	}

}
