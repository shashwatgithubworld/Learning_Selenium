package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetOptions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement multiSelectDropDown = driver.findElement(By.id("select-multiple-native"));
		
		Select s = new Select(multiSelectDropDown);
		
		List<WebElement> allOption = s.getOptions();
		
		/*
		for(int i=0; i<=allOption.size(); i++)
		{
			System.out.println(allOption.get(i).getText());
		}
	*/
		
		for(WebElement options:allOption)
		{
			System.out.println(options.getText());
		}
	}

}
