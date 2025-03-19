package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy extends ActionsClass.BaseClass{

	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&p%5B%5D=");
		
		WebElement element = driver.findElement(By.xpath("//div[@class='PYKUdo'][1]"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(element, 100, 0).perform();
		
	}

}
