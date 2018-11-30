package radioAndcheckbox;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Randomselect {
	
	@Test
	public void radiobuttonrandomselect() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Random rand=new Random();
		
		//Random_radiobutton_click
		List <WebElement> radio=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		    int value=rand.nextInt(radio.size());
		    WebElement jg=radio.get(value);
		    jg.click();
		    System.out.println("The value selected is "+jg.getAttribute("value"));
		
		//Random_checkbox_select
//		List <WebElement> checkbox=driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
//		int val=rand.nextInt(checkbox.size());
//		WebElement jd=checkbox.get(val);
//		jd.click();
//		System.out.println("The value selected is "+jd);
//		driver.close();
		}
	
	}


