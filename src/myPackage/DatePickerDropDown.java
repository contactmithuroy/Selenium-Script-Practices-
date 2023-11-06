package myPackage;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDropDown {
	public static void main(String[] args) {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
						
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		
		String day = "29";
		String month = "Jan";
		String year = "2013";
				
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		// Below element we have to pass in the "Select class" then we select the value in a variable
		Select mont_drp = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
		mont_drp.selectByVisibleText(month); // Select the value
		//driver.findElement(By.xpath("//select[@aria-label='Select month']")).click();
		//driver.findElement(By.xpath("//select[@aria-label='Select year']")).click();
		Select year_drp = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
		year_drp.selectByVisibleText(year); 
		
		List<WebElement> allDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement ele:allDate) {
			String dt =ele.getText();
			if(dt.equals(day)) {
				ele.click();
				break;
			}
		}
	}

}
