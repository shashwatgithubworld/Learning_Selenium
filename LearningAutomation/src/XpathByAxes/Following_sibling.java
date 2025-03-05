package XpathByAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Following_sibling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		WebElement lastname = driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']/following-sibling::div[@class='mbm _1iy_ _a4y rfloat _ohf']	"));
		lastname.sendKeys("kumar");

	}

}
