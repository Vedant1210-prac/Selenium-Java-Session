package day_44;

import org.testng.annotations.Test;

public class PaymentTest {
	
	
	@Test(priority=1, groups= {"Sanity","Regression","functional"})
	void paymentByrupees() {
		
		System.out.println(" payment in rupees");
	}
	
	@Test(priority=2, groups= {"Sanity","Regression", "functional"})
	void paymentBydollar() {
		
		System.out.println(" payment in dollar");
	}

	@Test(priority=3, groups= {"Sanity","Regression", "functional"})
	void paymentBypound() {
		
		System.out.println(" payment in pound");
	}

}
