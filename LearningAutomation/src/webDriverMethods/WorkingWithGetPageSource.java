package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetPageSource {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		
		String sourceCode = driver.getPageSource();
		System.out.print(sourceCode);

	}

}
