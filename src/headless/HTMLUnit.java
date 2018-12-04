package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnit {

	public static void main(String[] args) {
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("The page title is "+driver.getTitle());
	}

}
