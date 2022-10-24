package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectorshubXpathPracticeExplicitWait {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
		System.out.println("1");
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userId' and @title='Email']")));
		System.out.println("2");
		// WebElement list = driver.findElement(By.xpath("//input[@id='userId' and
		// @title='Email']"));
		System.out.println("3");
		element.click();
		System.out.println("4");
		element.sendKeys("fsadfdsafsa");
		System.out.println("5");
		element.click();
		System.out.println("6");

	}

}
