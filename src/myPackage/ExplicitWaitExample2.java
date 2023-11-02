package myPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample2 {

	public static void main(String[] args) {
		String browserType = "edge";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		By elelocator = By.xpath("//a[normalize-space()='WebDriver']"); // xPath variable how to declare
		
		// Call the function of Explicit Wait Element
		WebElement element = waitForElementPresent(driver, elelocator, 10); // driver, locator variable, timeout time
		element.click();
	}
	
	//WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut); // syntax
	// Write a generic method for Explicitly wait 
	// Here we are declare public static method thats why we call directly in main method of multiple time
	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
		WebDriverWait myWait = new WebDriverWait (driver, 20);
		myWait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator); // it will be return value of locator
	}

}
