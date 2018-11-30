package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
	
	@Test
	public void dragdrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement ele2=driver.findElement(By.xpath("//*[@id='droppable']"));
		action.dragAndDrop(ele1, ele2).build().perform();
		Thread.sleep(2000);
		driver.close();
	}

}
