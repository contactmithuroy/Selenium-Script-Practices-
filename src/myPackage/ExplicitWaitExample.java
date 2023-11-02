package myPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
		WebDriverWait myWait = new WebDriverWait (driver, 20);
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		WebElement element = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='WebDriver']")));
		element.click();
		
		// ITS means the web element is not available or not contain or any bug essue then it will be wait 10 sec(cut of time) the throw any other expecption
	}

}
