package day_43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	@Test
	void testTitel() {
		
		String act_title = "OpenCart";
		
		String exp_title = "Openshot";
		
		/*if(act_title.equals(exp_title)) {
			
			System.out.println("test passed");
		}else {
			
			System.out.println("test failed");
			
		}*/
		
		//Assert.assertEquals(act_title, exp_title);
		
		if(act_title.equals(exp_title)) {
			
			System.out.println("test passed");
			Assert.assertTrue(true);
		}else {
			
			System.out.println("test failed");
			Assert.assertTrue(false);
			
		}
	}

}
