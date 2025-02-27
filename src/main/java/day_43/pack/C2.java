package day_43.pack;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.Test;

public class C2 {
	
	@Test(priority=2)
	void xyz() {
		
		System.out.println("XYZ");
	}

	
	@AfterTest
	void after() {
		
		System.out.println("After");
	}
}
