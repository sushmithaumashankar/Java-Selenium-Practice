import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJs {

	public static void main(String[] args) {
		File src = new File("C:\\Users\\sushmitha\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		WebDriver driver=new PhantomJSDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("The title of the page is "+driver.getTitle());
	}

}
