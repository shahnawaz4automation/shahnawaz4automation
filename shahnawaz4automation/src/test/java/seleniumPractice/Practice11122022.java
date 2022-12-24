package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice11122022 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("amazon");
		driver.findElement(By.xpath("//span[text()='amazon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' and contains(text(),'Amazon.in')]")).click();
		String pageHomePageTitle = driver.getTitle();
		System.out.println(pageHomePageTitle);
		
		String homePageUrl = driver.getCurrentUrl();
		System.out.println(homePageUrl);
		
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Shop & Pay | Earn rewards daily')]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Shop & Pay | Earn rewards daily')]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Shop & Pay | Earn rewards daily')]")).isSelected());
	}
}
