package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingUrlAndTitleOfZomato {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
