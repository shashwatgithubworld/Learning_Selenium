package Assignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicLaunchingBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Browser name");
		String browser = s.next();
		if (browser.equals("Chrome")) 
			driver = new ChromeDriver();
		else if (browser.equals("firefox")) 
			driver = new FirefoxDriver();
		else if (browser.equals("edge")) 
			driver = new EdgeDriver();
		else 
			System.out.println("Invalid Browser");
			
		
		s.close();
	}

}
