package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadPopup extends BaseClass{

	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		WebElement fileUpload = driver.findElement(By.id("fileInput"));
		fileUpload.sendKeys("C:\\Users\\nisha\\OneDrive\\Desktop\\Notes\\Selenium\\Selenium Notes 1.pdf");
	}

}
