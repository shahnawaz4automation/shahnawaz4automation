package seleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JscriptExecuter {
	
	//This will scroll, until the particular element is visible on the page.
	public static void scrollToElementUsingJS(WebElement element, WebDriver driver){
	                  JavascriptExecutor js = (JavascriptExecutor)driver;
	                   js.executeScript("arguments[0].scrollIntoView(true);",element);
	}

}
