package radioAndcheckbox;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioCheckbox_Buttons {
	
	@Test
	public void radiobutton() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Radio_button
		List <WebElement> radio=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		for(int i =0;i<radio.size();i++) {
			WebElement radio_val=radio.get(i);
			String val=radio_val.getAttribute("value");
			System.out.println("The value is "+val);
			if(val.equalsIgnoreCase("ruby")) {
				radio_val.click();
				System.out.println("The clicked button is "+val);
			}
		}
		//checkbox
//		List <WebElement> checkbox=driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
//			for(int i =0;i<checkbox.size();i++) {
//				WebElement check_val=checkbox.get(i);
//				String ch_val=check_val.getAttribute("id");
//				System.out.println("The value is "+ch_val);
//				if(ch_val.equalsIgnoreCase("code")) {
//					check_val.click();
//					System.out.println("The clicked button is "+ch_val);
//				}
//				
//			}
		

	

	}
//	driver.close();
}
