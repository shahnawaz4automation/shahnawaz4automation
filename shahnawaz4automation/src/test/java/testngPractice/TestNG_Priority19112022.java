package testngPractice;

import org.testng.annotations.Test;

public class TestNG_Priority19112022 {
  @Test(enabled = false)
  public void testMethod1() throws InterruptedException {
	  System.out.println("TestNG_Priority -> testMethod1");
	  Thread.sleep(10);
  }
  
  @Test(priority = 1,timeOut = 100)
  public void testMethod2() throws InterruptedException {
	  System.out.println("TestNG_Priority -> testMethod2");
	  //Thread.sleep(10);
  }
  
  @Test(priority = 0)
  public void testMethod3() throws InterruptedException {
	  System.out.println("TestNG_Priority -> testMethod3");
	  Thread.sleep(10);
  }
}
