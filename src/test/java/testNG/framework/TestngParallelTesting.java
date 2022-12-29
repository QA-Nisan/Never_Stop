package testNG.framework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import luma.us.basePage.BasePage;

public class TestngParallelTesting extends BasePage{
 @Test
	public void getTest1() throws InterruptedException {
		logger.info("******* Test Execute on Chrome Browser  ********");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.quit();
	}
 
	@Test
public void getTest2() throws InterruptedException {
	logger.info("******* Test Execute on Chrome Browser  ********");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.quit();
	}
	
	@Test
public void getTest3() throws InterruptedException {
	logger.info("******* Test Execute on Chrome Browser  ********");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.quit();
}
	
}
