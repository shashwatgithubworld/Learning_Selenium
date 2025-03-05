package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		Point xy = driver.manage().window().getPosition();
		System.out.println(xy);
		
		driver.get("https://paytm.com/");

	}

}
