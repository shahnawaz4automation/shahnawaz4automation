package testngPractice;

import org.testng.annotations.Test;

public class TestNG_TestAnnotation24122022 {
	@Test
	public void testMethod1() {
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(2, 3);
		System.out.println("Running Test -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Running Test -> testMethod3");
	}
}
