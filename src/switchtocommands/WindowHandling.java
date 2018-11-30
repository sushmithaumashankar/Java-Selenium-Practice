package switchtocommands;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\sushmitha\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println("Parent window session ID is  "+parent);
		driver.findElement(By.xpath("//*[@id='post-body-6170641642826198246']/a[1]")).click();
		Set<String> allwindows=driver.getWindowHandles();
		int count=allwindows.size();
		System.out.println("The count is "+count);
		for(String child:allwindows) {
			if(!parent.equalsIgnoreCase(child)) {
				WebDriver ele=driver.switchTo().window(child);
				System.out.println("the child window id is "+ele);
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium webdriver");
				Thread.sleep(2000);
				driver.close();
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		System.out.println("The parent page title is "+driver.getTitle());
		driver.quit();
	}

}
