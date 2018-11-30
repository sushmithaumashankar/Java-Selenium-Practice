package switchtocommands;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling3 {

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
		for(String child: allwindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("The child window title is "+driver.getTitle());
				System.out.println("The child session id is "+child);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("the parent session id is "+parent);
		driver.quit();
	}

}
