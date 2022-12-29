package luma.us.genericCode;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import luma.us.basePage.BasePage;



public class CommonUtility extends BasePage {

	public static void getMouseHover(WebElement elem) {
		Actions ac = new Actions(driver);
		ac.moveToElement(elem).build().perform();
	}
	
public static void getActionClick(WebElement elem) {
	Actions ac = new Actions(driver);
	ac.click(elem).build().perform();	
}
	
public static void getJsClick(WebElement elem) {
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", elem);
}

public static void getLoopingClick(String xpath) {
	WebElement elementClick = driver.findElement(By.xpath(""));
	for(int i = 0; i <= 299; i++) {
		elementClick.click();
		break;
}	
}

//static drop down-
public static void getSelectValues(WebElement elem,String text) {
	Select select = new Select (elem);
	select.selectByVisibleText(text);	
}

//creating random data -
public static String getRandomStringValues() {
	String name = RandomStringUtils.randomAlphabetic(5);
	return name;
}
public static String getRandomNumericValues() {
	String num = RandomStringUtils.randomNumeric(10);
	return num;
	
}
	
//window handle - 
public static void WindowHandle() throws Throwable {
	String MainWindow = driver.getWindowHandle();
	Set<String> s1 = driver.getWindowHandles();
	Iterator<String> i1 = s1.iterator();
	while (i1.hasNext()) {
		String ChildWindow = i1.next();
		System.out.println(driver.getTitle());
		if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
			driver.switchTo().window(ChildWindow);
			// Closing the Child Window.
			driver.close();
		}
	}
	driver.switchTo().window(MainWindow);
}

//fluent wait - 
public static Actions getAction() {
	Actions ac = new Actions(driver);
	return ac;
}
public static void waitThenClick(WebElement element, WebDriver driver) {
	try {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(6000)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(element));
		if (element.isDisplayed() && element.isEnabled()) {
			getAction().moveToElement(element);
			getAction().click(element).build().perform();
		}
	} catch (TimeoutException toe) {
		logger.log(Level.WARN, " Interrupted! ", toe);
		Thread.currentThread().interrupt();
	} catch (Exception e) {
		logger.log(Level.WARN, "Interrup ted!", e);
		Thread.currentThread().interrupt();
	}
}

//Take Screenshot
public static void captureScreenshot(WebDriver driver, String screenshotName) {
	try {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("./Screenshots/" + screenshotName + ".png"));
		System.out.println("Screenshot taken");
	} catch (Exception e) {
		System.out.println("Exception while taking screenshot " + e.getMessage());
	}
}

}
// public static void getAssertion(String actual,String expected) {
//  Assert.assertEquals(actual, expected);
//  logger.info("***verified expected value***" + expected); 
//}
