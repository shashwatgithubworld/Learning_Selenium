package Frame;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomateDream11 extends BaseClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		setUp("chrome", 20, "https://www.dream11.com/");
		
		/*
		//switching from main page to iframe using index
		driver.switchTo().frame(0);
		*/
		
		/*
		//switching using id or name Attribute
		driver.switchTo().frame("send-sms-iframe");
        */
		
		
		//switching control using WeBelemnt element		
		WebElement iframe = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(iframe);

		
		/*
		// Switching control from i-frame to parent frame page
		driver.switchTo().parentFrame();
		*/
		/*
		//switching control from any iframe to main page
		driver.switchTo().defaultContent();
		*/
	}

}
