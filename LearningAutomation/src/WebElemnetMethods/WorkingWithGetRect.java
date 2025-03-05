package WebElemnetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetRect {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Rectangle r = logo.getRect();
		
		int x = r.getX();
		System.out.println(x);
		int y = r.getY();
		System.out.println(y);
		int h = r.getHeight();
		System.out.println(h);
		int w = r.getWidth();
		System.out.println(w);
		
		

	}

}
