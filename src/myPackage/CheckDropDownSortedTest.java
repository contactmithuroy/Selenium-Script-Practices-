package myPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class CheckDropDownSortedTest {

	public static void main(String[] args) {
		//With import other package for Web drive
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
						
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);

	}

}
