package utilities_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFectory_1 {
	public static WebDriver open(String browserType) {
		

		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumWebdriver\\chromedriver-win64119\\chromedriver.exe");
			return  new ChromeDriver();
		}else {
			System.setProperty("webdriver.edge.driver","E:\\Selenium\\SeleniumWebdriver\\edgedriver_win64\\msedgedriver.exe");
			return  new EdgeDriver();
	}

}
}