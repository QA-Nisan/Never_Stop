package luma.usa.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import luma.us.basePage.BasePage;
import luma.us.genericCode.CommonUtility;

public class TestListener extends BasePage implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("On Test Start: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		CommonUtility.captureScreenshot(driver, "Test Success");
		logger.info("On Test Success: "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		CommonUtility.captureScreenshot(driver, "Failed Test");
		logger.info("On Test Failure: "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("On Test Skipped: "+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		logger.info("On Test Success Percentage: "+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName());
		
	}


}
