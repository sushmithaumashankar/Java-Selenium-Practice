package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadless {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver=new ChromeDriver(option);
		driver.navigate().to("http://learn-automation.com/");
		System.out.println("The title is "+driver.getTitle());
		driver.close();

	}

}
