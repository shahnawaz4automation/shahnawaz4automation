package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown03122022 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement drpCountryele = driver.findElement(By.xpath("//select[@name='country_id']"));
		selectDropDownOption(drpCountryele, "India");
	}
	public static void selectDropDownOption(WebElement element,String optionToBeSelected){
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		for(WebElement option:allOptions) {
			if(option.getText().equals(optionToBeSelected)) {
				option.click();
			}
		}
	}

}
