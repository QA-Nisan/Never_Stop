package luma.usa.stepDefinition;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import luma.us.basePage.BasePage;
import luma.us.genericCode.CommonUtility;
import luma.us.genericCode.WaitHelper;
import luma.us.pageFactory.ElementPage;


public class StepDefinition extends BasePage {
	ElementPage ep;
	
	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() {
		
	ep = PageFactory.initElements(driver, ElementPage.class);
	
	logger.info("*** User already logged in the application ***");
	ep.getLogIn();
	
	logger.info("*** User verified the users information on the screen***");
	String expected = "Welcome, MUHANA TRISHA!";
	String actual = ep.getverifyUserInfo().getText();
	Assert.assertEquals(actual,expected);
	}
	
	@When("User should be able to select {string} jacket from men module")
	public void user_should_be_able_to_select_jacket_from_men_module(String getJupiter) {
		
		
		  logger.info("*** User able to mouse hover over on the men module ***");
		  WaitHelper.getWaitForElement(ep.getmouseHoverOnMen(), 20);
		  CommonUtility.getMouseHover(ep.getmouseHoverOnMen());
		  
		  logger.info("*** User able to mouse hover over on the top module ***");
		  WaitHelper.getWaitForElement(ep.getmouseHoverOnTops(), 20);
		  CommonUtility.getMouseHover(ep.getmouseHoverOnTops());
		  
		  logger.info("*** User able to click on the jacket module ***");
		  WaitHelper.getWaitForElement(ep.getclickJacketButton(), 20);
		  CommonUtility.getActionClick(ep.getclickJacketButton());
		 
	}
	@When("Verify the jacket name on the {string} list")
	public void verify_the_jacket_name_on_the_list(String Jacket) {
	
	logger.info("*** User able to click on the jupiter jacket module ***");
	WaitHelper.getWaitForElement(ep.getclickOnJupiterJacket(), 20);
	CommonUtility.getActionClick(ep.getclickOnJupiterJacket());
		
	logger.info("*** User verified the jupiter jacket on the screen***");
	String expected = prop.getProperty("VerifiedJupiterJacket");
	String actual = ep.getverifyJupiterJacket().getText();
//		CommonUtility.getAssertion(actual, expected);
	Assert.assertEquals(actual, expected);
	}
	
	@When("User should be able to select the {string} and {string} and {string} then click on the add to cart")
	public void user_should_be_able_to_select_the_and_and_then_click_on_the_add_to_cart(String getSize, String getColor, String getQuantity ) {
		
		logger.info("*** User able to select the jupiter jacket's size ***");
		WaitHelper.getWaitForElement(ep.getselectSize(), 20);
		CommonUtility.getJsClick(ep.getselectSize());
		
		logger.info("*** User able to select the jupiter jacket's color ***");
		WaitHelper.getWaitForElement(ep.getselectColor(), 20);
		CommonUtility.getJsClick(ep.getselectColor());
		
		logger.info("*** User able to select the jupiter jacket's quantity ***");
		WaitHelper.getWaitForElement(ep.getselectQuantity(), 20);
		ep.getselectQuantity().clear();
		ep.getselectQuantity().sendKeys("1");
		
		logger.info("*** User able to click on add to cart BTN ***");
		WaitHelper.getWaitForElement(ep.getclickOnAddToCart(), 20);
		CommonUtility.getJsClick(ep.getclickOnAddToCart());
		
	}
	
		@When("User should be able to click on the cart and checkout")
	public void user_should_be_able_to_click_on_the_cart_and_checkout() {
	    
		logger.info("*** User able to click on shoppig cart BTN ***");
		WaitHelper.getWaitForElement(ep.getclickOnShoppingCart(), 20);
		CommonUtility.getActionClick(ep.getclickOnShoppingCart());
			
		logger.info("*** User able to click on process to checkout BTN ***");
		WaitHelper.getWaitForElement(ep.getClickOnProcessToCheckout(), 20);
		CommonUtility.getActionClick(ep.getClickOnProcessToCheckout());
	}
	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
	    
		logger.info("*** User able to click on add new address BTN ***");
		WaitHelper.getWaitForElement(ep.getClickOnAddNewAddress(), 20);
		CommonUtility.getJsClick(ep.getClickOnAddNewAddress());
		
		logger.info("*** User able to enter address details for shipping ***");
		ep.getNewAddressDetails();
		
		logger.info("*** User able to select shipping method ***");
		driver.navigate().refresh();
		WaitHelper.getWaitForElement(ep.getSelectShippingMethod(), 20);
		CommonUtility.getJsClick(ep.getSelectShippingMethod());

		logger.info("***User able to click te next BTN ***");
		WaitHelper.getWaitForElement(ep.getClickOnNext(), 20);
		CommonUtility.getActionClick(ep.getClickOnNext());
		
		logger.info("***User able to click on place on BTN ***");
		WaitHelper.getWaitForElement(ep.getClickOnPlaceOrder(), 20);
		CommonUtility.getJsClick(ep.getClickOnPlaceOrder());
	}
	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {
	    
		logger.info("***User able to on place the order ***");
		WaitHelper.getWaitForElement(ep.getClickOnPlaceOrder(), 20);
		CommonUtility.getJsClick(ep.getClickOnPlaceOrder());
		
	}
	@Then("User should be able to verify the order number and get text on the screen {string}")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen(String expected) {
	    
		
		logger.info("***User able to get the new order confirmation number ***");
		WaitHelper.getWaitForElement(ep.getOrderNumber(), 20);
	    String actual =	ep.getOrderNumber().getText();
        logger.info("This is the new order number: "+actual);
        
        CommonUtility.captureScreenshot(driver, "verify the order number");
        
        logger.info("***User able to get the order confirmation text ***");
		WaitHelper.getWaitForElement(ep.getVerifyOrderConfirmationText(), 20);
	    String actual2 = ep.getVerifyOrderConfirmationText().getText();
        logger.info("This is the order confirmation text: "+actual2);
        Assert.assertEquals(expected, actual2);
	}

}
