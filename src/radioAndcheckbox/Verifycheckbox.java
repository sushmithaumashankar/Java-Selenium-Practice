package radioAndcheckbox;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifycheckbox {
	
	@Test
	public void radiobutton() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Random rand=new Random();
		String[] exp= { "Singing", "Coding" };
		int count=0;
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
		int get_size=checkbox.size();
		Assert.assertEquals(get_size, 2);
		System.out.println("The checkbox count is "+get_size);
		for(WebElement ele:checkbox) {
			String value=ele.getText();
			for(int i=0;i<exp.length;i++) {
				if(value.equalsIgnoreCase(exp[i])) {
					System.out.println(exp[i]);
					count++;
				}
			}
		}
		if(count==exp.length) {
			System.out.println("matched");
		}else {
			System.out.println("Not matched");
		}
		int select_val=rand.nextInt(checkbox.size());
		WebElement uj=checkbox.get(select_val);
		uj.click();
		System.out.println("the selected button is "+uj.getAttribute("innerHTML"));
		Thread.sleep(2000);
		driver.close();
	}
}
