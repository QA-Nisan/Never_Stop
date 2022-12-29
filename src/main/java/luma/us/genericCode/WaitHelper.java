package luma.us.genericCode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import luma.us.basePage.BasePage;

public class WaitHelper extends BasePage {

	public static void getWaitForElement(WebElement elem, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
		
	}
}
