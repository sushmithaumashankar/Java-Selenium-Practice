package switchtocommands;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println("The parent session ID is "+parent);
		Set<String> allwindows=driver.getWindowHandles();
		int count=allwindows.size();
		System.out.println("Total windows count is "+count);
		ArrayList<String> arr=new ArrayList<>(allwindows);
		driver.switchTo().window(arr.get(1));
		System.out.println("The window title is "+driver.getTitle());
		driver.close();
		driver.switchTo().window(arr.get(2));
		driver.manage().window().maximize();
		System.out.println("The window title is "+driver.getTitle());
		driver.findElement(By.xpath("//html/body/a/img")).click();
		System.out.println("the current title is "+driver.getTitle());
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(parent);
		System.out.println("the parent session id is "+driver.getTitle());
		driver.quit();
	}

}
