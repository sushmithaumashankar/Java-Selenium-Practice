package exceptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IllegalException {

	public static void main(String[] args) {
		WebDriver driver;
		try {
		driver=new FirefoxDriver();
		driver.get("https://eb-dev.azurewebsites.net/");
		}catch(IllegalArgumentException  i){
			System.out.println("Error "+i.getMessage());
		}
	}
}
