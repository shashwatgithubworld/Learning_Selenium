package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDelhiMetro {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://delhimetrorail.com/");
		
		WebElement fromTextFeild = driver.findElement(By.xpath("//input[@id='FromStation']"));
		fromTextFeild.click();
		
		WebElement line2 = driver.findElement(By.xpath("//div[text()='MILLENNIUM CITY CENTRE GURUGRAM']"));
		line2.click();
		
		
		WebElement jgpStation = driver.findElement(By.xpath("//font[text()='JAHANGIRPURI']"));
		jgpStation.click();
		
	
		WebElement toStation = driver.findElement(By.xpath("//input[@id='ToStation']"));
		toStation.click();
		
		
		WebElement yellowLine = driver.findElement(By.xpath("//div[text()='MILLENNIUM CITY CENTRE GURUGRAM']"));
		yellowLine.click();
		
	
		WebElement gtbnStation = driver.findElement(By.xpath("//font[text()='GURU TEG BAHADUR NAGAR']"));
		gtbnStation.click();
		
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Show Route & Fare']"));
		submitBtn.click();
		
		
		WebElement cross = driver.findElement(By.xpath("//button[@class=\"btn-close \"]"));
		cross.click();
		
		for(int i=0; i<=2; i++)
			driver.findElement(By.xpath("//li[text()='+']")).click();
		
		
		
	}

}
