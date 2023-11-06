package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropImages {
	public static void main(String[] args) throws InterruptedException {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("http://www.globalsqa.com/demo-site/draganddrop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		
		//Firstly we have to switch to frame with web element cz ther are no id or class
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement item1 = driver.findElement(By.xpath("//li[1]")); // source 1
		WebElement item2 = driver.findElement(By.xpath("//li[2]")); // source 2
		
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']")); // Destination
		
		Actions act = new Actions(driver);
		act.dragAndDrop(item1, trash).perform(); // drag action for image 1
		act.dragAndDrop(item2, trash).perform(); // drap action for image 2
		
		Thread.sleep(7000);
		driver.quit();
		driver.close();
	}

}
