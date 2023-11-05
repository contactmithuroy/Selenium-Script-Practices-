package myPackage;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
		//Login button click
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// Closing alart box
		driver.findElement(By.cssSelector(".btn-close")).click();
		
		// Sellse-> Orders
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		// Find the total number of pages in order table
		//String pages = driver.findElement(By.cssSelector(".col-sm-6.text-end")).getText();
		String pagesText = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
	
		
		/*
			pagesText.indexOf("(") == Starting form "(" sign, +1 means next value
			pagesText.indexOf("Pages") == Ending to "Pages" word, -1 means before space before Pages word
			
			substring() = method means subtract the string to at any "Start" "End" point
			Integer.valueOf() == This method catch only number value if anything is there
			
		 */
		int total_pages = Integer.valueOf(pagesText.substring(pagesText.indexOf("(")+1, pagesText.indexOf("Pages")-1));
		//System.out.println("Total number of pages: "+total_pages); //total pages
		
		for(int p =1; p<=total_pages; p++) {
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']/li/span"));
			System.out.println("Active Page: "+active_page.getText());
			active_page.click();
			
			
			List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr"));
			System.out.println("Size of row: "+rows.size()+"==> for page: "+active_page.getText());
			
			String pageno = Integer.toString(p+1);
			driver.findElement(By.xpath("//ul[@class='pagination']/li//a[text()='"+pageno+"']")).click();
			
			
		}
		
		
	}

}
