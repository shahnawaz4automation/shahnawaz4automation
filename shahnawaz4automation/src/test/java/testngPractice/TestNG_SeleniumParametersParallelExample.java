package testngPractice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterClass;

public class TestNG_SeleniumParametersParallelExample {
	WebDriver driver;
	String baseURL;

	@BeforeClass
	@Parameters({"browser"})
	public void setup(String browser) {
		baseURL = "https://letskodeit.teachable.com";
		if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	@Test
	public void testLogin() {
		WebElement loginLink = driver.findElement(By.xpath("//a[contains(@href,'sign_in')]"));
		loginLink.click();
	}

	@AfterClass
	public void cleanUp() {
		driver.quit();
	}

}
