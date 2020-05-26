package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Base;

public class LoginTest extends Base {

	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initlaizedriver();
		 

	}
	@Test
	void FirstTestCase() {
		System.out.println("First Test case");
	}
}
