package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class PromptPopUp extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");

		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(2000);

		Alert a = driver.switchTo().alert();
		a.getText();
		// if we need to pass the value
		a.sendKeys("yes");

		//if we need to capture the msg
		System.out.println(a.getText());
		
		//we need to validate the msg
		if(a.getText().equals("Do you like automation? [yes/no]"))
		{
			System.out.println("Msg is validated successfully");
		}
		else
		{
			System.out.println("Msg is not validated ");
		}
		
		// if i want to click on ok button
		 a.accept();

		// if we want to click on cancel button
		//a.dismiss();

	}

}
