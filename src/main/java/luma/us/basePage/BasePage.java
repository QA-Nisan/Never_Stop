package luma.us.basePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

public static Logger logger;
public static WebDriver driver;
public static Properties prop;

public WebDriver getDriver () {
	return driver;
}

public BasePage() {
	logger = Logger.getLogger("QA Tester Nisan");  
	PropertyConfigurator.configure("Log4j.properties");
	try {

		prop = new Properties();
		FileInputStream ip = new FileInputStream(
		System.getProperty("user.dir") + "/src/main/java/luma/us/config/Config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	} catch (IOException e) {
		System.out.println(e.getMessage());

	} finally { 
		System.out.println("The finally statement is executed file not found");
	}
 }

public static void getInitialization() {
	String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			logger.info("*** I am a chrome browser***");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equals("chrome")) {
			logger.info("***I am a chrome browser***");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equals("headless")) {
			logger.info("*** I am a headless mode chrome browser***");
			String chromeDriverPath = prop.getProperty("mac");
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200",
					"--ignore-certificate-errors", "--silent");
			driver = new ChromeDriver(options);
			
		} else if (browserName.equals("ie")) {
			logger.info("*** I am a ie browser***");
			System.setProperty("webdriver.ie.driver", prop.getProperty("mac"));
			driver = new InternetExplorerDriver();

		} else if (browserName.equals("edge")) {
			logger.info("*** I am a edge browser***");
			System.setProperty("webdriver.edge.driver", prop.getProperty("mac"));
			driver = new EdgeDriver();
			
		} else if (browserName.equals("firefox")) {
			logger.info("*** I am a firefox browser***");
			System.setProperty("webdriver.geckodriver.driver", prop.getProperty("mac"));
			driver = new FirefoxDriver();
			
		} else if (browserName.equals("safari")) {
			logger.info("*** I am a safari browser***");
			System.setProperty("webdriver.safari.driver", prop.getProperty("mac"));
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}

	}