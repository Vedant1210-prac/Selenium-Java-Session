package day_43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class C3 {
	
	
	@BeforeSuite
	void beforeSuite() {
		
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	void afterSuite() {
		
		System.out.println("AfterSuite");
	}
}
