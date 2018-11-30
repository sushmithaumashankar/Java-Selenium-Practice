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
public class Dropdown3 {

	public void select_dropdown2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement month_id=driver.findElement(By.xpath("//*[@id='month']"));
		int count=0;
		String[] exp = { "Month", "Jan", "Feb", "Mar", "Apr", "May", "jkj", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" };
		Select month=new Select(month_id);
        List<WebElement> months_count=month.getOptions();
		int count1=months_count.size();
		Assert.assertEquals(count1,13);
	
		for(WebElement ele:months_count) {
			String months_name=ele.getText();
			for(int i=0;i<exp.length;i++) {
//			Assert.assertEquals(months_name, exp[i]);
			if(months_name.equals(exp[i])) 
			{
					
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
		
		driver.close();
		}
	}
		
		
		
		
		
		
		
		
		
//		int count=0;
//		String[] exp = { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" };
//		WebElement month_id=driver.findElement(By.xpath("//*[@id='month']"));
//		Select dropdown =new Select(month_id);
//		List<WebElement> options=dropdown.getOptions();
//		for(WebElement ele:options) {
//			
//				for(int i=0;i<exp.length;i++) {
//					String months=ele.getText();
//					if (months.equals(exp[i]))
////					Assert.assertEquals(months,exp[i]);
//					count++;
//				}
//			
//		}
//		if(count==exp.length) {
//		System.out.println("matched");
//	}else {
//		System.out.println("Not matched");
//	}
//		Thread.sleep(1000);
//		driver.quit();
	



//WebElement dropdown = driver.findElement(By.xpath("//*[@id='month']"));
//Select select = new Select(dropdown);
//
//List<WebElement> options = select.getOptions();
//loop: for (WebElement we : options) {
//	for (int i = 0; i < exp.length; i++) {
//		Assert.assertEquals(we.getText(), exp[i]);
//		break loop;
//		// if (we.getText().equals(exp[i])){
//		// System.out.println("Matched");
//		// break loop;
//	}
//}
//// }
