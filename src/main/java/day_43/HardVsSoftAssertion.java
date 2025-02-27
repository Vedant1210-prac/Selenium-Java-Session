package day_43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {
	
	/*@Test
	void test_hardAssertion() {
		
		System.out.println("Testing-1");
		System.out.println("Testing-2");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("Testing-3");
		System.out.println("Testing-4");
		
		
	}*/
	
	@Test
	void test_softAssertion() {
		
		System.out.println("Testing-1");
		System.out.println("Testing-2");
		

		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(1, 2);
		
		System.out.println("Testing-3");
		System.out.println("Testing-4");
		
		sa.assertAll(); //mandatory
		
		
	}

}
