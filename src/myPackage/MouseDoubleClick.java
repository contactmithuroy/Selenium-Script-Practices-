package myPackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);	
		
		WebElement dbbutton = driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
		Actions act = new Actions(driver); // User action class and perform any type of action
		act.doubleClick(dbbutton).perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(7000);
		driver.quit();
		driver.close();
		
	}

}
