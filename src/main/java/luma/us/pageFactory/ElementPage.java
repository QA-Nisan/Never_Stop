package luma.us.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import luma.us.basePage.BasePage;
import luma.us.genericCode.CommonUtility;
import luma.us.genericCode.WaitHelper;
public class ElementPage extends BasePage{

public ElementPage () {	
PageFactory.initElements(driver, this);
}

@FindBy (xpath = "(//*[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/'])[1]")
@CacheLookup
private WebElement ClickSignIn;
public WebElement getClickSignIn() {
	return ClickSignIn;
}

@FindBy (xpath = "//*[@id='email']")
@CacheLookup
private WebElement userName;
public WebElement getUserName() {
	return userName;
}

@FindBy (xpath ="(//input[@id='pass'])[1]")
@CacheLookup
private WebElement password;
public WebElement getpassword() {
	return password;
}

@FindBy (xpath ="(//span[text()='Sign In'])[1]")
@CacheLookup
private WebElement clickLogin;
public WebElement getclickLogin() {
	return clickLogin;
}

@FindBy (xpath ="(//*[text()='Welcome, MUHANA TRISHA!'])[1]")
@CacheLookup
private WebElement verifyUserInfo;
public WebElement getverifyUserInfo() {
	return verifyUserInfo;
}

@FindBy (xpath ="//*[text()='Men']")
@CacheLookup
private WebElement mouseHoverOnMen;
public WebElement getmouseHoverOnMen() {
	return mouseHoverOnMen;
}

@FindBy (xpath ="(//*[text()='Tops'])[2]")
@CacheLookup
private WebElement mouseHoverOnTops;
public WebElement getmouseHoverOnTops() {
	return mouseHoverOnTops;
}

@FindBy (xpath ="(//*[text()='Jackets'])[2]")
@CacheLookup
private WebElement clickJacketButton;
public WebElement getclickJacketButton() {
	return clickJacketButton;
}

@FindBy (xpath ="(//a[@class='product-item-link'])[3]")
@CacheLookup
private WebElement clickOnJupiterJacket;
public WebElement getclickOnJupiterJacket() {
	return clickOnJupiterJacket;
}

@FindBy (xpath ="//span[@class='base']")
@CacheLookup
private WebElement verifyJupiterJacket;
public WebElement getverifyJupiterJacket() {
	return verifyJupiterJacket;
}

@FindBy (xpath ="//div[@id='option-label-size-143-item-168']")
@CacheLookup
private WebElement selectSize;
public WebElement getselectSize() {
	return selectSize;
}

@FindBy (xpath ="//*[@id='option-label-color-93-item-50']")
@CacheLookup
private WebElement selectColor;
public WebElement getselectColor() {
	return selectColor;
}

@FindBy (xpath ="//input[@class='input-text qty']")
@CacheLookup
private WebElement selectQuantity;
public WebElement getselectQuantity() {
	return selectQuantity;
}

@FindBy (xpath ="//*[@class='action primary tocart']")
@CacheLookup
private WebElement clickOnAddToCart;
public WebElement getclickOnAddToCart() {
	return clickOnAddToCart;
}

@FindBy (xpath ="//a[text()='shopping cart']")
@CacheLookup
private WebElement clickOnShoppingCart;
public WebElement getclickOnShoppingCart() {
	return clickOnShoppingCart;
}

@FindBy (xpath ="(//*[@class='action primary checkout'])[2]")
@CacheLookup
private WebElement ClickOnProcessToCheckout;
public WebElement getClickOnProcessToCheckout() {
	return ClickOnProcessToCheckout;
}

@FindBy (xpath ="//span[text()='New Address']")
@CacheLookup
private WebElement ClickOnAddNewAddress;
public WebElement getClickOnAddNewAddress() {
	return ClickOnAddNewAddress;
}

//Address Details

@FindBy (xpath ="(//*[@type='text'])[2]")
@CacheLookup
private WebElement EnterFirstName;
public WebElement getEnterFirstName() {
	return EnterFirstName;
}
@FindBy (xpath ="(//*[@type='text'])[3]")
@CacheLookup
private WebElement EnterLastName;
public WebElement getEnterLastName() {
	return EnterLastName;
}
@FindBy (xpath ="(//*[@type='text'])[4]")
@CacheLookup
private WebElement EnterCompany;
public WebElement getEnterCompany() {
	return EnterCompany;
}
@FindBy (xpath ="(//*[@type='text'])[5]")
@CacheLookup
private WebElement EnterStreetAddress;
public WebElement getEnterStreetAddress() {
	return EnterStreetAddress;
}
@FindBy (xpath ="(//*[@type='text'])[8]")
@CacheLookup
private WebElement EnterCity;
public WebElement getEnterCity() {
	return EnterCity;
}
@FindBy (xpath ="(//*[@class='select'])[1]")
@CacheLookup
private WebElement EnterState;
public WebElement getEnterState() {
	return EnterState;
}
@FindBy (xpath ="(//*[@type='text'])[10]")
@CacheLookup
private WebElement EnterZipCode;
public WebElement getEnterZipCode() {
	return EnterZipCode;
}
@FindBy (xpath ="(//*[@class='select'])[2]")
@CacheLookup
private WebElement EnterCountry;
public WebElement getSelectCountry() {
	return EnterCountry;
}
@FindBy (xpath ="(//*[@type='text'])[11]")
@CacheLookup
private WebElement EnterPhoneNumber;
public WebElement getEnterPhoneNumber() {
	return EnterPhoneNumber;
}
@FindBy (xpath ="//*[text()='Ship here']")
@CacheLookup
private WebElement ClickOnShipHere;
public WebElement getClickOnShipHere() {
	return ClickOnShipHere;
}

@FindBy (xpath ="(//*[@type='radio'])[1]")
@CacheLookup
private WebElement SelectShippingMethod;
public WebElement getSelectShippingMethod() {
	return SelectShippingMethod;
}

@FindBy (xpath ="//*[text()='Next']")
@CacheLookup
private WebElement ClickOnNext;
public WebElement getClickOnNext() {
	return ClickOnNext;
}

@FindBy (xpath ="//*[@class='action primary checkout']")
@CacheLookup
private WebElement ClickOnPlaceOrder;
public WebElement getClickOnPlaceOrder() {
	return ClickOnPlaceOrder;
}

@FindBy (xpath ="//*[text()='Your order number is: ']")
@CacheLookup
private WebElement OrderNumber;
public WebElement getOrderNumber() {
	return OrderNumber;
}

@FindBy (xpath ="//*[text()='Thank you for your purchase!']")
@CacheLookup
private WebElement VerifyOrderConfirmationText;
public WebElement getVerifyOrderConfirmationText(){
	return VerifyOrderConfirmationText;
}


public void getLogIn() {

getClickSignIn().click();
logger.info("***User able to click on sign-in button***");
getUserName().sendKeys(prop.getProperty("userName"));
logger.info("***User able to enter the username***");
getpassword().sendKeys(prop.getProperty("textPassword"));	
logger.info("***User able to enter the user password***");
getclickLogin().click();
logger.info("***User able to click on log-in button***");
}

public void getNewAddressDetails() {
	
logger.info("***User able to enter the first name***");
WaitHelper.getWaitForElement(getEnterFirstName(), 20);
getEnterFirstName().clear();
getEnterFirstName().sendKeys("QA");

logger.info("***User able to enter the last name***");
WaitHelper.getWaitForElement(getEnterFirstName(), 20);
getEnterLastName().clear();
getEnterLastName().sendKeys("Nisan");	
	
logger.info("***User able to enter the company name***");
WaitHelper.getWaitForElement(getEnterCompany(), 20);
getEnterCompany().clear();
getEnterCompany().sendKeys("420 Office");	

logger.info("***User able to enter the company's street name***");
WaitHelper.getWaitForElement(getEnterStreetAddress(), 20);
getEnterStreetAddress().clear();
getEnterStreetAddress().sendKeys("2 Times Square");	

logger.info("***User able to enter the company's city name***");
WaitHelper.getWaitForElement(getEnterCity(), 20);
getEnterCity().clear();
getEnterCity().sendKeys("Manhattan");

logger.info("***User able to choose the company's state name***");
WaitHelper.getWaitForElement(getEnterState(), 20);
CommonUtility.getSelectValues(getEnterState(), "New York");

logger.info("***User able to enter the company's zip code ***");
WaitHelper.getWaitForElement(getEnterZipCode(), 20);
getEnterZipCode().clear();
getEnterZipCode().sendKeys("10036");

logger.info("***User able to choose the country from box ***");
WaitHelper.getWaitForElement(getSelectCountry(), 20);
CommonUtility.getSelectValues(getSelectCountry(), "United States");

logger.info("***User able to enter their phone number as of now random  ***");
WaitHelper.getWaitForElement(getEnterPhoneNumber(), 20);
getEnterPhoneNumber().clear();
getEnterPhoneNumber().sendKeys(CommonUtility.getRandomNumericValues());

logger.info("***User able to click the ship here BTN ***");
WaitHelper.getWaitForElement(getClickOnShipHere(), 20);
CommonUtility.getActionClick(getClickOnShipHere());


}
}
