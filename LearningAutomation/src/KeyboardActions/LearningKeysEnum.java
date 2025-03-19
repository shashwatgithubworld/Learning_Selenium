package KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LearningKeysEnum extends BaseClass{

	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin", Keys.TAB, "admin123", Keys.TAB, Keys.ENTER);
		
	}

}
