package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement extends ActionsClass.BaseClass{

	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://paytm.com/");
		
		WebElement ticket = driver.findElement(By.xpath("//li[text()='Ticket Booking']"));
		Actions a = new Actions(driver);
		a.moveToElement(ticket).perform();
	}
}