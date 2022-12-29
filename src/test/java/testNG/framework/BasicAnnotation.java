package testNG.framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {

	@BeforeSuite
	public void getBeforeSuite() {
		System.out.println("getBeforeSuite");
	}

	@BeforeTest
	public void getBeforeTest() {
		System.out.println("getBeforeSuite");
	}

	@BeforeClass
	public void getBeforeClass() {
		System.out.println("getBeforeClass");
	}

	@BeforeMethod
	public void getBeforeMethod() {
		System.out.println("getBeforeMethod");
	}

	@Test
	public void getTest() {
		System.out.println("getTest");
	}

	@AfterMethod
	public void getAfterMethod() {
		System.out.println("getAfterMethod");
	}

	@AfterClass
	public void getAfterClass() {
		System.out.println("getAfterClass");
	}

	@AfterTest
	public void getAfterTest() {
		System.out.println("getAfterTest");
	}

	@AfterSuite
	public void getAfterSuite() {
		System.out.println("getAfterSuite");
	}

}
