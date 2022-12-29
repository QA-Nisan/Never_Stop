package testNG.framework;

import org.testng.annotations.Test;

public class TestngMultipleTimesRun {

	@Test(invocationCount=10)
	public void getTest() {
		System.out.println("Test Actions");

	}
}
