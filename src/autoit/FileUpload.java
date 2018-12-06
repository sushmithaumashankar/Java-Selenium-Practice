package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/sushmitha/Desktop/fileupload.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("1")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\sushmitha\\Desktop\\BlogUpload.exe");
		Thread.sleep(3000);
		driver.close();
	}
}
