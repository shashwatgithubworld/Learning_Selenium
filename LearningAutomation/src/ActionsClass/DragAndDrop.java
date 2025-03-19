package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends ActionsClass.BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		
		WebElement moCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement moCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		WebElement lapCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement lapCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		WebElement moAccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement lapAccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDrop(moCharger, moAccessories).perform();
		Thread.sleep(2000);
		a.dragAndDrop(moCover, moAccessories).perform();
		Thread.sleep(2000);
		a.dragAndDrop(lapCharger, lapAccessories).perform();
		Thread.sleep(2000);
		a.dragAndDrop(lapCover, lapAccessories).perform();
		
		
		
	}

}
