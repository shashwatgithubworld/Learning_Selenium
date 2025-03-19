package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class AutomateNaukari extends BaseClass {

	public static void main(String[] args) throws InterruptedException, AWTException {

		setUp("chrome", 20,
				"https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQjw1um-BhDtARIsABjU5x5VV-aY_V9Aso3E6wTrvut7BgnshM__7cq_P2aKS0PkPT6updVP-o0aAvtUEALw_wcB&gclsrc=aw.ds");

		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();

		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();

		Thread.sleep(2000);

		// select the path
		StringSelection s = new StringSelection("C:\\Users\\nisha\\Downloads\\sodapdf-converted.pdf");

		// select the path inside Clipboard
		Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
		c.setContents(s, null);

		// paste the file
		Robot r = new Robot();
		// presing the keys
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		// releasing the key
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
