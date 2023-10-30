package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionNotificationPopup {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//if it is firefox and use FirefoxOptions
		options.addArguments("--disable-notifications");
		//----------before create webdriver need to declear and disable this type of notification
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Selenium\\\\SeleniumWebdriver\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options); // have to pass options object otherwise it will be not work
		driver.get("https://www.redbus.in");
		
	
		

	}

}
