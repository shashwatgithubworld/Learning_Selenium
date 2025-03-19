package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.redbus.in/bus-tickets/delhi-to-agra?fromCityName=Delhi&fromCityId=733&srcCountry=IND&toCityName=Agra&toCityId=1290&destCountry=IND&onward=11-Mar-2025&opId=0&busType=Any");
		/*
		WebElement multiSelectDropDown = driver.findElement(By.id("select-multiple-native"));
		
		Select s = new Select(multiSelectDropDown);
		WebElement alloptions = s.getWrappedElement();
		System.out.println(alloptions.getText());
		*/
		
		//WebElement viewSeats = driver.findElement(By.xpath("//div[text()='NueGo']/following::div[text()='07:25']/ancestor::li[@id='27307630']/descendant::div[text()='View Seats']"));
		WebElement viewSeats = driver.findElement(By.xpath("//div[text()='NueGo']/following::div[text()='07:25']/ancestor::li[@class='row-sec clearfix']/descendant::div[text()='View Seats']"));
		viewSeats.click();
		
		
	}

}
