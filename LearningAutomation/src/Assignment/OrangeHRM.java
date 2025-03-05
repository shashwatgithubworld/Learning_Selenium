package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		username.sendKeys("Admin");
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,'oxd')]"));
		loginButton.click();
		
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		if(currentUrl.equalsIgnoreCase(expectedUrl))
			System.out.println("URL has been matched ");
		else
			System.out.println("URL does not matched");
		
		Thread.sleep(2000);
		WebElement PIM = driver.findElement(By.xpath("//span[text()='PIM']"));
		PIM.click();
		
		Thread.sleep(3000);
		WebElement addEmploye = driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]"));
		addEmploye.click();
		
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstName.sendKeys("Shashwat");
		
		Thread.sleep(2000);
		WebElement middleName = driver.findElement(By.xpath("//input[contains(@name,'middleName')]"));
		middleName.sendKeys("Kumar");
		
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("Singh");
		
		Thread.sleep(2000);
		WebElement toggleButton = driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"));
		toggleButton.click();
		
		Thread.sleep(2000);
		WebElement createUserName = driver.findElement(By.xpath("//label[text()='Username']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@class='oxd-input oxd-input--active']"));
		createUserName.sendKeys("Shashwat95");
		
		Thread.sleep(2000);
		WebElement createPassword = driver.findElement(By.xpath("//label[text()='Password']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@class='oxd-input oxd-input--active']"));
		createPassword.sendKeys("Shashwat@12345");
		
		Thread.sleep(2000);
		WebElement confirmPassword = driver.findElement(By.xpath("//label[text()='Confirm Password']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@class='oxd-input oxd-input--active']"));
		confirmPassword.sendKeys("Shashwat@12345");
		
		Thread.sleep(2000);
		WebElement saveButton = driver.findElement(By.xpath("//button[text()=' Save ']"));
		saveButton.click();
		
		Thread.sleep(8000);
		WebElement userProfile = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		userProfile.click();
		
		Thread.sleep(2000);
		WebElement logOutButton = driver.findElement(By.xpath("//a[text()='Logout']"));
		logOutButton.click();
	
		Thread.sleep(6000);
		WebElement newUserName = driver.findElement(By.xpath("//input[@name='username']"));
		newUserName.sendKeys("Shashwat95");
		
		Thread.sleep(2000);
		WebElement newPassword = driver.findElement(By.xpath("//input[@name='password']"));
		newPassword.sendKeys("Shashwat@12345");
		
		Thread.sleep(2000);
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()=' Login ']"));
		loginBtn.click();
		
		
	}

}
