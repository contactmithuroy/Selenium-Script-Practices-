package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JqueryDropDown {

	public static void main(String[] args) {
		//With import other package for Web drive
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
				
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		
		driver.findElement(By.id("justAnInputBox")).click();
		//selectChoiceValues(driver,"choice 1"); //single choice
		selectChoiceValues(driver,"choice 1","choice 2 1", "choice 2 2", "choice 6 1"); // multiple choice
		selectChoiceValues(driver,"all"); // all choice
		
	}
	public static void selectChoiceValues(WebDriver driver, String... value) { //Hold multiple value using String...
		List<WebElement> choiceList = driver.findElements(By.className("comboTreeItemTitle"));
		
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement item:choiceList) {
				String text = item.getText();
				
				for(String val:value) {
					if(text.equals(val)) {
						item.click();
						break;
					}
				}
			}
		}
		else {
			try {
				for(WebElement item:choiceList) {
					item.click();
				}
			}catch(Exception e) {
				
			}
		}
		
		
	}

}
