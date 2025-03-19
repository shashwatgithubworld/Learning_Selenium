package KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AutomateDemoWebShop extends BaseClass{

	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/virtual?sublist=0&scenario=1");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("shashwat123@gmail.com", Keys.TAB, "123456", Keys.TAB, Keys.ENTER );

	}

}
