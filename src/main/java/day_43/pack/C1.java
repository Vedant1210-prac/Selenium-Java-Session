package day_43.pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class C1 {
	
	@Test(priority=1)
	void abc() {
		System.out.println("ABC");
	}

	@BeforeTest
	void before() {
		
		System.out.println("Before");
		
	}
}
