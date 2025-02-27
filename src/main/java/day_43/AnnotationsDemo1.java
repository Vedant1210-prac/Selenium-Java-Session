package day_43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	
	@BeforeMethod
	void login() {
		
		System.out.println("Login");
		
	}
	
	@Test(priority=1)
	void search() {
		
		System.out.println("Search");
	}
	
	@AfterMethod
	void logout() {
		
		System.out.println("Logout");
		
	}
	
	
	@Test(priority=2)
	void adv_Search() {
		
		System.out.println("Adv Search");
		
	}
}

