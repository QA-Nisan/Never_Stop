package testNG.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import luma.us.basePage.BasePage;

public class CrossBrowserTesting extends BasePage {

	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser) throws Exception {

		if (browser.equalsIgnoreCase("FireFox")) {
			logger.info("******* Test Execute on Safari Browser  ********");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} 
		else if (browser.equalsIgnoreCase("Chrome")) {
			logger.info("******* Test Execute on Chrome Browser  ********");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else if (browser.equalsIgnoreCase("Edge")) {
			logger.info("******* Test Execute on Edge Browser  ********");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} 
		else {
			logger.info("******* Incorrect Browser path or another version ********");
			throw new Exception("Incorrect Browser");
		}
	}

	@Test
	public void getTest() throws InterruptedException {
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

	@AfterMethod
	public void getTearDown() {
		driver.quit();
	}

}
