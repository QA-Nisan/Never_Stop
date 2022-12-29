package testNG.framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngFailedTestCasesRun {

	@Test()
	public void getTest1() {
		Assert.assertTrue(true);
		System.out.println("Test1 Actions");
	}
	
	@Test()
	public void getTest2() {
		Assert.assertTrue(true);
		System.out.println("Test2 Actions");
	}
	
	@Test()
	public void getTest3() {
		Assert.assertTrue(true);
		System.out.println("Test3 Actions");
	}
	
	@Test()
	public void getTest4() {
		Assert.assertTrue(true);
		System.out.println("Test4 Actions");
	}
	
}
