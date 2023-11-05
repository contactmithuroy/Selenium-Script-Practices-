package myPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;

public class DynamicWebTableWithPegination {

	public static void main(String[] args) {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Login
		WebElement username = driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("demo");
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		
		// Closing alart box
		driver.findElement(By.cssSelector(".btn-close")).click();
		
		// Sellse-> Orders
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		// Find the total number of pages in order table
		String pages = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		//String pages = driver.findElement(By.cssSelector(".col-sm-6.text-end")).getText();
		System.out.println(pages);
		
		
		
	}

}
