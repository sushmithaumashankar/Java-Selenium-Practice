package pagetitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifypageTitle {
	
	@Test
	public void verifypagetitle() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Page_Title
		String title=driver.getTitle();
		System.out.println(title);
//		String ele="Facebook – log in or sign up";
//		Assert.assertEquals(title,ele);
//		System.out.println("Matched " +title);
		//////////////////////////////////////
		Assert.assertTrue(title.contains("Facebook"));
		//////////////////////////
		
		//Page_Source
		String source=driver.getPageSource();
		System.out.println(source);
		Assert.assertTrue(source.contains("onloadRegister_DEPRECATED"));
		driver.close();
	}

}
