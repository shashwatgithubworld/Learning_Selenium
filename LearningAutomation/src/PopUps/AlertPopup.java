package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertPopup extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/alert?sublist=0");
		
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		
		//We need to switch control from main page to alert popup
		Alert a = driver.switchTo().alert();
		
		//Click on Ok button
		a.accept();
		
		

	}

}
