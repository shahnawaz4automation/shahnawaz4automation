package seleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import shahnawazm.utilities.HandleMultipleDropdowns;

public class HandleDropdown12112022 {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		WebDriverManager.edgedriver ().setup();
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Features')][position()='1']"))).click();
		
		//WebElement dropdown = driver.findElement(By.id("input-country"));
		//HandleMultipleDropdowns.selectOptionFromDropDown(dropdown, "Cuba");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\screenshots\\featuresPage.png");
		FileUtils.copyFile(source, target);
	}

}
