package day_44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	@Test(priority=1)
	void openApp() {
		
		System.out.println("Open App");
		
		Assert.assertTrue(true);;
	}
	

	@Test(priority=2, dependsOnMethods = "openApp")
	void login() {
		
		System.out.println("Login");
		
		Assert.assertTrue(true);
	}
	@Test(priority=3, dependsOnMethods="login")
   void search() {
		
		System.out.println("Search");
		Assert.assertTrue(false);

	}
	
	@Test(priority=4, dependsOnMethods= {"login", "search"})
	   void advsearch() {
			
			System.out.println("ADV Search");
		}
   
	@Test(priority=5, dependsOnMethods="login")
   void logout() {
		
		System.out.println("Logout");
	}

}
