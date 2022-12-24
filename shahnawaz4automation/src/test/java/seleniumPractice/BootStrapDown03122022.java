package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDown03122022 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://www.hdfcbank.com");
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@class='btn-primary dropdown-toggle btn-block' and contains(text(),'Select Product Type')]")).click();
		List<WebElement> productTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		selectOptionfromDropDown(productTypes,"Loans");
	}
	public static void selectOptionfromDropDown(List<WebElement> options, String value){
		for(WebElement pType: options) {
			if(pType.getText().equals(value)){
				pType.click();
					break;
			}
		}
	}

}
