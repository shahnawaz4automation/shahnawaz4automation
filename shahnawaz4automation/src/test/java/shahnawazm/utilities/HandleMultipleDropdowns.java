package shahnawazm.utilities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropdowns {

	public static void selectOptionFromDropDown(WebElement element, String value) {
		Select select = new Select(element);

		List<WebElement> list = select.getOptions();

		for (WebElement e : list) {
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}

	}

}
