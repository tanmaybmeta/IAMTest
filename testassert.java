package testngpractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testassert {
	
	@Test
	public void testingiam() {
//		Assert.assertEquals(1, 1);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(1, 1, "test");
		soft.assertTrue(false, "test2");
		soft.assertAll();
	}
}
