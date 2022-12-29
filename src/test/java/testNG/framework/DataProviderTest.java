package testNG.framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
@DataProvider(name="dataprovider")
	public Object [][]dpMethod(){
		return new Object [][] {{"QA Nisan"},{"Winner"}};
	}

		
	@Test(dataProvider="dataprovider")
	public void getMyTest(String value) {
		System.out.println("pass parameter is: "+ value);
	}
}
