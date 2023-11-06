package myPackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {
	public static void main(String[] args) throws InterruptedException {
		String browserType = "chrome"; 
		WebDriver driver; 
		driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		act.contextClick(button).perform(); // Right click action
		
		Thread.sleep(7000);
		driver.quit();
		driver.close();
	}

}
