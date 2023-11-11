package myPackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionMultipleKey {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String browserType = "edge";
		driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("https://www.text-compare.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		input1.sendKeys("Welcome to Selenioum Multiple Key operation");
		Actions act = new Actions(driver);
		
		// Ctrl+a =Select All\
		act.keyDown(Keys.CONTROL); // press the control key
		act.sendKeys("a"); // Press a 
		act.keyUp(Keys.CONTROL); // Realse the control key
		act.perform();
		
		// Ctrl+a =Copy All\
		act.keyDown(Keys.CONTROL); // press the control key
		act.sendKeys("c"); // Press a 
		act.keyUp(Keys.CONTROL); // Realse the control key
		act.perform();
		
		// Pess "Tab" key to perform to go 2nd input box
		act.sendKeys(Keys.TAB);
		act.perform();
		
		// Ctrl+V = Paste
		act.keyDown(Keys.CONTROL); // press the control key
		act.sendKeys("v"); // Press a 
		act.keyUp(Keys.CONTROL); // Realse the control key
		act.perform();
		
		// Compare text
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("Text are copied");
		}else {
			System.out.println("Text are not copied");
		}
		Thread.sleep(5000);
		driver.quit();
		driver.close();
	}

}
