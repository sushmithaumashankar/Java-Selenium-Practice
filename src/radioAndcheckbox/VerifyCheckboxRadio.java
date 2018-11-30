package radioAndcheckbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCheckboxRadio {
	
	@Test
	public void radiobutton() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int count1=0;
		String [] radio_exp= { "Java ", "C# ", "Python ", "Ruby "};
		List <WebElement> radio=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		int count=radio.size();
		System.out.println(count);
		Assert.assertEquals(count, 4);
		for(WebElement ele:radio) {
			String radio_value=ele.getText();
			for(int i=0;i<radio_exp.length;i++) {
				if(radio_value.equals(radio_exp[i])) {
					System.out.println(radio_exp[i]);
					count1++;
				}
			}
		}
		if(count1==radio_exp.length) {
			System.out.println("matched");
		}else {
			System.out.println("Not matched");
		}
		driver.close();
	}
}

