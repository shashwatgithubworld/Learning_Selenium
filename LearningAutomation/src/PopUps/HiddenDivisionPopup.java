package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HiddenDivisionPopup extends BaseClass {

	public static void main(String[] args) {

		setUp("chrome", 3, "https://www.goibibo.com/");

		String yearMonth = "November 2025";
		int day = 26;

		driver.findElement(By.xpath("//span[@role='presentation']")).click();

		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		for (;;) {
			try {
				WebElement xpath = driver.findElement(By.xpath("//div[text()='" + yearMonth
						+ "']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='" + day + "']"));
				xpath.click();
				break;
			} catch (Exception e) {

				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}

		}

	}

}
