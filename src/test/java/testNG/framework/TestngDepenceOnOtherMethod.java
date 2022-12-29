package testNG.framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDepenceOnOtherMethod {

	@Test()
	public void getTest1() {
		Assert.assertTrue(false);
		System.out.println("Test1 Actions");
	}

	@Test(dependsOnMethods= {"getTest1"})
	public void getTest2() {
		System.out.println("Test2 run depends on Test1");

	}

}
