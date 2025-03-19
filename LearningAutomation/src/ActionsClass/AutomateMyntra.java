package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutomateMyntra extends BaseClass{

	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://www.myntra.com/");
		
		WebElement beauty = driver.findElement(By.xpath("//a[@data-reactid='643']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(beauty).perform();
		
		driver.findElement(By.xpath("//a[text()='Perfume']")).click();
		
		WebElement recommended = driver.findElement(By.xpath("//span[text()='Recommended']"));
		a.moveToElement(recommended).perform();
		
		driver.findElement(By.xpath("//label[text()='Price: Low to High']")).click();

	}

}
