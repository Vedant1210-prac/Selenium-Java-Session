package day_44;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1, groups= {"Sanity"})
	void loginByEmail() {
		
		System.out.println("Login By Email");
	}
	
	@Test(priority=2, groups= {"Sanity"})
	void loginByFB() {
		
		System.out.println("Login By FB");
	}
	
	@Test(priority=3, groups= {"Sanity"})
	void loginByTwitter() {
		
		System.out.println("Login By Twitter");
	}

}
