package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateRedBus {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		//From Station
		WebElement src = driver.findElement(By.id("src"));
		src.sendKeys("delhi");
		driver.findElement(By.xpath("//text[text()='Delhi']")).click();
		
		//To station
		WebElement dest = driver.findElement(By.id("dest"));
		dest.sendKeys("agra");
		driver.findElement(By.xpath("//text[text()='Agra']")).click();
		
		//Picking the date
		driver.findElement(By.xpath("//span[text()='14']")).click();
		
		//Clicking on Search Buses
		driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
		
		//Choosing the bus and clicking on View-seats
		driver.findElement(By.xpath("//div[text()='NueGo']/following::div[text()='16:25']/ancestor::li[@class='row-sec clearfix']/descendant::div[text()='View Seats']")).click();
		
		//clicking on cross
		driver.findElement(By.xpath("//i[@class='icon-close closepopupbtn']")).click();
		
		WebElement canvas = driver.findElement(By.xpath("//canvas[@data-type='lower']"));
		Point canvasLocation = canvas.getLocation();
		int canvasX = canvasLocation.getX();
		int canvasY = canvasLocation.getY();
		
		int seatX = canvasX + 200;
		int seatY = canvasY + 60;
		
		Actions a = new Actions(driver);
		a.moveToElement(canvas, seatX, seatY).click().perform();
		
		
		
		
		
		
		
		

	}

}
