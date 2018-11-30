package windowAuthentication;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowAuth {

	public static void main(String[] args) throws IOException {
//		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver" ,"C:\\Users\\sushmitha\\Downloads\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Runtime.getRuntime().exec("C:\\Users\\sushmitha\\Desktop\\winAuth.exe");
		driver.get("https://www.engprod-charter.net/");
		driver.quit();
	}

}