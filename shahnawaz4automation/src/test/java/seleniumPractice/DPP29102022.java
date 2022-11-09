package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DPP29102022 {
	
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://courses.letskodeit.com/practice");
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Support')]")).getText());
		/*
		 * driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		 * driver.findElement(By.xpath("//input[@type='email']")).clear();
		 */
		/*
		 * driver.get("https://courses.letskodeit.com/practice");
		 * driver.navigate().to("https://courses.letskodeit.com");
		 * driver.findElement(By.xpath("//a[contains(text(),'Support')]")).click();
		 * driver.navigate().refresh(); driver.navigate().back();
		 */
		/*
		 * //getTitle of page String pageTitle = driver.getTitle();
		 * System.out.println(pageTitle);
		 * 
		 * //capture the url
		 *
		 * WebElement PracticePageHeader =
		 * driver.findElement(By.xpath("//a[contains(text(),'Support')]"));
		 * if(PracticePageHeader.isEnabled()) {
		 * System.out.println("Element is selected"); } else {
		 * System.out.println("Element is not selected"); 
		 */
	
		driver.quit();
	}

}
