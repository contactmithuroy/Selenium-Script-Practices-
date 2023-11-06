package myPackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDrop {
	public static void main(String[] args) throws InterruptedException {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		
		//First drag and drop 
		WebElement rome = driver.findElement(By.id("box6")); // source element 
		WebElement Italy = driver.findElement(By.id("box106")); // target element 
		Actions act = new Actions(driver);
		act.dragAndDrop(rome, Italy).perform();
		
		//Second drag and drop
		WebElement oslo = driver.findElement(By.id("box1")); // source element 
		WebElement norway = driver.findElement(By.id("box101")); // target element 
		act.dragAndDrop(oslo, norway).perform(); // act already declare 
		
		
		Thread.sleep(7000);
		driver.quit();
		driver.close();
		
	}
}
