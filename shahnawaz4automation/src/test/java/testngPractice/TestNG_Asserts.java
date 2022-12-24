package testngPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Asserts {
  @Test
  public void testSum() {
	  SomeClassToTest obj = new SomeClassToTest();
	  int result = obj.sumNumbers(1, 2);
	  Assert.assertEquals(result, 3);
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
	  int[] expectedArray = {1,2,3};
	  int[] result = obj.getArray();
	  Assert.assertEquals(result,expectedArray);
  }
}
