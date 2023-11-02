package myPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		long time = 2000;
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.name("q")).sendKeys("Selenium");
		 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		 driver.findElement(By.xpath("//a[normalize-space()='WebDriver']")).click();
		 
		 
		 
	}

}
