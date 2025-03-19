package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class ConfirmationPopup extends BaseClass{

	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		
		driver.findElement(By.id("buttonAlert5")).click();
		
		Alert a = driver.switchTo().alert();
		
		//If i need to click on Ok Button
		a.accept();
		
		//If i need to click on Cancel Button
		a.dismiss();
		

	}

}
