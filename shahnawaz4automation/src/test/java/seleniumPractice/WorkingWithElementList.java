package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithElementList {
	String baseUrl;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get("https://www.amazon.in/");
		//driver.get("https://letskodeit.teachable.com/");
	    driver.get("https://letskodeit.teachable.com/p/practice");
		//WebElement practiceLink =driver.findElement(By.xpath("/html/body/header/div/div/div/div/ul/li[1]/a"));
		//practiceLink.click();
		System.out.println("Website launched");
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'https://courses.letskodeit.com/practice')]"));
		link.click();
	}

}
