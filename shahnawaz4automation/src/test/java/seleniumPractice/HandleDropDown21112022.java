package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown21112022 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement drpCountryele = driver.findElement(By.xpath("//select[@id='input-country']"));
		
		Select select = new Select(drpCountryele);
		List<WebElement> allOptions = select.getOptions();
	}

}
