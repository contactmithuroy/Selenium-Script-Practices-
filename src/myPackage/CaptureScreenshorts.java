package myPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CaptureScreenshorts {

	public static void main(String[] args) throws IOException, InterruptedException {
		String browserType = "edge";
		WebDriver driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		/*
		//Full Page Screen Short
		TakesScreenshot ts = (TakesScreenshot)driver; // Create a instance for screenshot
		File source = ts.getScreenshotAs(OutputType.FILE); // Take a screen shot and save as a source file "source"
		File tragetFolder = new File(".//Screenshot//homepage.png"); // It will be create our own location
		FileUtils.copyFile(source, tragetFolder); // Here some problem for FileUtils. In this error we have to download appacy common IO jar file
		//FileHandler.copy(source, tragetFolder);
		// check this video : https://youtu.be/LzS_2WW7vSQ
		*/
		
		/*
		// Screenshot of section or portion of the page
		WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File source = section.getScreenshotAs(OutputType.FILE);
		File tragetFolder = new File(".//Screenshot//Section.png"); 
		FileUtils.copyFile(source, tragetFolder);
		*/
		
		
		// Screenshot of any specific portion of the page-> like logo of the page
		WebElement section = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File source = section.getScreenshotAs(OutputType.FILE);
		File tragetFolder = new File(".//Screenshot//Logo.png"); 
		FileUtils.copyFile(source, tragetFolder);
				
				
		
		Thread.sleep(5000);
		driver.quit();
		driver.close();
		
	}

}
