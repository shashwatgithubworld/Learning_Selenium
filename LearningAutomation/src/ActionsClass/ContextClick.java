package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClick extends ActionsClass.BaseClass{

	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		
		WebElement btn = driver.findElement(By.id("btn30"));
		Actions a = new Actions(driver);
		a.contextClick(btn).perform();
		
		driver.findElement(By.xpath("//div[text()='Yes']")).click();

	}

}
