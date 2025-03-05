package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WorkingWithGetTitle {

	public static void main(String[] args) {
		
		//To launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//To Launch the Application
		driver.get("https://paytm.com/");
		
		//To get the Title of the application 
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
		
		if (actualTitle.equals(expectedTitle))
			System.out.println("Home page is Displyed");
		else
			System.out.println("Home Page is not Displyed ");

	}

}
