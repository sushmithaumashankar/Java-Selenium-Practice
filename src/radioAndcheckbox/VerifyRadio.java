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

public class VerifyRadio {
	
	@Test
	public void radiobutton() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Random rand=new Random();
		int count1=0;
		String[] exp_radioData= {"Java","C#","Python","Ruby"};
		List<WebElement> actual_radiodata=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		int radio_count=actual_radiodata.size();
		System.out.println("The actual count is "+radio_count);
		Assert.assertEquals(radio_count, 4);
		for(WebElement ele:actual_radiodata) {
			String radio_text=ele.getAttribute("value");
			for(int i=0;i<exp_radioData.length;i++) {
			if(radio_text.equalsIgnoreCase(exp_radioData[i]))
			{
				System.out.println(exp_radioData[i]);
				count1++;
			}
		}
		}
		if(count1==exp_radioData.length) {
			System.out.println("Matched");
		}else {
			System.out.println("Not matched");
		}
		int select_button=rand.nextInt(actual_radiodata.size());
		WebElement gh=actual_radiodata.get(select_button);
		gh.click();
		System.out.println("The selected value is "+gh.getAttribute("value"));
		Thread.sleep(2000);
		driver.close();
	}
}
