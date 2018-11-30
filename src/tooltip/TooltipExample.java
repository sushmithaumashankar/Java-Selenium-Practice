package tooltip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TooltipExample {
	
	@Test
	public void tt() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ele =driver.findElement(By.xpath("//button[text()='Automation Tools']"));	
		Actions builder=new Actions(driver);
		builder.moveToElement(ele).perform();	
		Thread.sleep(2000);
		List<WebElement> tooltip=driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		int count=tooltip.size();
		Assert.assertEquals(count, 3);
		for(WebElement ele1:tooltip) {
			String values=ele1.getAttribute("innerHTML");
			boolean status=ele1.isEnabled();
			System.out.println("the link is "+values + "with the status " +status);
			if(values.equalsIgnoreCase("Appium")) {
				ele1.click();
				String value="Complete Ultimate Appium tutorial for beginners";
				String ele2=driver.findElement(By.xpath("//div[@class='fusion-page-title-captions']/h1")).getText();
				Assert.assertEquals(value, ele2);
			}
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
