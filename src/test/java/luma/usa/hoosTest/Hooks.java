package luma.usa.hoosTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import luma.us.basePage.BasePage;
import luma.us.genericCode.CommonUtility;

public class Hooks extends BasePage {

	
@Before
public  void getStart () {
logger.info(">>>Automation Start<<<");
BasePage.getInitialization();
}
	
@After
public void getTearDown(Scenario scenario) {
if(scenario.isFailed()) {
CommonUtility.captureScreenshot(driver, "failed test");
}
logger.info(">>>Automation End<<<");
driver.quit();
}	
}
