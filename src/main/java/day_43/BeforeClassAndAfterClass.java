package day_43;

import org.testng.annotations.*;

public class BeforeClassAndAfterClass {
	
	@BeforeClass
	void login() {
		
		System.out.println("Login");
	}
	
	@Test
	void search() {
		
		System.out.println("Search");
	}
	
	@Test
	void adv_search() {
		
		System.out.println("Adv Search");
	}
	
	@AfterClass
	void logout() {
		
		System.out.println("Logout");
	}
	

}
