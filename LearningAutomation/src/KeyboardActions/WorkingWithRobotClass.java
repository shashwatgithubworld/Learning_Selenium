 package KeyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class WorkingWithRobotClass extends BaseClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		setUp("chrome", 20, "https://www.myntra.com/");

		// Press ctrl+shift+i

		Robot r = new Robot();
		/*
		 * r.keyPress(KeyEvent.VK_CONTROL);
		 * r.keyPress(KeyEvent.VK_SHIFT);
		 * r.keyPress(KeyEvent.VK_I);
		 * 
		 * r.keyRelease(KeyEvent.VK_CONTROL); 
		 * r.keyRelease(KeyEvent.VK_SHIFT);
		 * r.keyRelease(KeyEvent.VK_I);
		 * 
		 */
		
		//scrolling on Myntra.com
		for (int i = 0; i < 8; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}

	}

}
