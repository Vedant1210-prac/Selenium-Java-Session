package day_42;

import org.testng.annotations.Test;

//1 open url

//2 login

//3 logout


public class myFirstTestCase {
	
	@Test(priority=10)
	void openurl() {
		
		System.out.println("Opening application");
		
	}
	
	@Test(priority=50)
	void login() {
		
		System.out.println("login successful");
	}
	
	@Test(priority=40)
	void logout() {
		
		System.out.println("logout successful");
	}

}
