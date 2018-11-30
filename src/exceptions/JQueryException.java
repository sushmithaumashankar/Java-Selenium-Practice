package exceptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryException {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
		driver.navigate().to("www.facebook.com/");
		driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		driver.close();
	}

}
