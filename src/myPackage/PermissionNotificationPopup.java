package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionNotificationPopup {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//if it is firefox and use FirefoxOptions
		options.addArguments("--disable-notifications");
		//----------before create webdriver need to declear and disable this type of notification
		String browerType = "chrome";
		WebDriver driver = utilities_1.DriverFectory_1.open(browerType);
		driver.get("https://www.redbus.in");
		
	
		

	}

}
