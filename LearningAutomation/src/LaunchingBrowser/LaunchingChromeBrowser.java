package LaunchingBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		

	}

}
