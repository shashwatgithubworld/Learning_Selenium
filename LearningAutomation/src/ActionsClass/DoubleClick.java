package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick extends ActionsClass.BaseClass{

	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		
		WebElement btn1 = driver.findElement(By.id("btn20"));
		Actions a = new Actions(driver);
		a.doubleClick(btn1).perform();
		
		WebElement btn2 = driver.findElement(By.id("btn23"));
		a.doubleClick(btn2).perform();
		
		WebElement btn3 = driver.findElement(By.id("btn28"));
		a.doubleClick(btn3).perform();

	}

}
