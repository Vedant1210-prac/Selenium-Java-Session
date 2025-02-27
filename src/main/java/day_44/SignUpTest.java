package day_44;

import org.testng.annotations.Test;

public class SignUpTest {
	
	@Test(priority=1, groups= {"Regression"})
	void SignupByEmail() {
		
		System.out.println("Signup by Email");
	}
	
	@Test(priority=2, groups= {"Regression"})
	void SignupByFB() {
		
		System.out.println("Signup by FB");
	}

	
	@Test(priority=3, groups= {"Regression"})
	void SignupByTwitter() {
		
		System.out.println("Signup by Twitter");
	}

}
