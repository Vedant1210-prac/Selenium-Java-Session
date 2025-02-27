package day_43;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssetionDemo {
	
	@Test
	void test() {
		
		//Assert.assertEquals("xyz", "xyz1"); //fail
		
		//Assert.assertEquals("123", 123); //fail
		
		Assert.assertNotEquals(123, 345); //pass
		
		
	}

}
