package day_43;

import org.testng.annotations.*;

public class AllAnnotations {
	
	
	@BeforeSuite
	void BeforeSuite() {
		
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	void AfterSuite() {
		
		System.out.println("AfterSuite");
		
	}
	
	@BeforeTest
	void BeforeTest() {
		
		System.out.println("BeforeTest");
	}

	@AfterTest
	void AfterTest() {
		
		System.out.println("AfterTest");
		
	}
	
	@BeforeClass
	void BeforeClass() {
		
		System.out.println("BeforeClass");
	}

	@AfterClass
	void AfterClass() {
		
		System.out.println("AfterClass");
		
	}
	
	@BeforeMethod
	void BeforeMethod() {
		
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	void AfterMethod() {
		
		System.out.println("AfterMethod");
		
	}
	
	@Test(priority=1)
	void Test1() {
		
		System.out.println("Test1");
	}
	
	@Test(priority=2)
	void Test2() {
		
		System.out.println("Test2");
	}
}
