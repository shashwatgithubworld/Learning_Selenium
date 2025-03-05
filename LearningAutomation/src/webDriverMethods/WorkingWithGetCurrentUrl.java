package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCurrentUrl {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://paytm.com/";
		
		if(actualUrl.equals(expectedUrl))
			System.out.println("My URL is Correct");
		else
			System.out.println("URL is not Correct");
		
		
		//Assignment
		//open ZOMATO and print the title and URL of it 
		//Open Swiggy and validate the title of the webpage 

	}

}
