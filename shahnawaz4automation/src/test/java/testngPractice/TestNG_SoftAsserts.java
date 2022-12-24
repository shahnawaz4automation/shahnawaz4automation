package testngPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAsserts {
	@Test
	public void testSum() {
		SoftAssert sa = new SoftAssert();
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		sa.assertEquals(result, 2);
		//sa.assertAll();
	}

	@Test
	public void testStrings() {
		SomeClassToTest obj = new SomeClassToTest();
		String result = obj.addStrings("Md", "Shahnawaz");
		Assert.assertEquals(result, "MdShahnawaz");
	}

	@Test
	public void testArrays() {
		SomeClassToTest obj = new SomeClassToTest();
		int[] expectedArray = { 1, 2, 3 };
		int[] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);
	}
}
