package myPackage;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//if it is firefox and use FirefoxOptions
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","E:\\\\Selenium\\\\SeleniumWebdriver\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options); // have to pass options object otherwise it will be not work

		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//span[@class='dateText']")).click();
		
		//input data
		String day = "29";
		String month = "Dec";
		String year = "2025";
			
		
		while(true) {
			String monthYear = driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText(); // here get 3 line 4 word value
			String arr[] = monthYear.split(" "); // split with space and get month and (year with 2nd line first word
			String mont = arr[0]; // Retrive month value
			String yerr = arr[1]; // Here we get two line value
			
			String yer = yerr.split("\\n")[0]; // Again split only first line value with \\n command
			
			//select month
			if(mont.equalsIgnoreCase(month) && yer.equals(year)) {
				break;
			}else {
				driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']")).click();
			}
		} //end while loop
			
			
			// Select day 
			// ***Important note. when user List<WebElement> then use findElements 
			List<WebElement> dateElementsNonHoliday = driver.findElements(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH']"));
			List<WebElement> dateEelementsHoliday = driver.findElements(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"));
			
	        //System.out.println(dateElementsNonHoliday);
	        for(WebElement ele:dateEelementsHoliday) {
	        	dateElementsNonHoliday.add(ele); // Merge two list
	        }
	        
	        for(WebElement ele:dateElementsNonHoliday) {
	        	String dt = ele.getText();
	        	if(dt.equals(day)) { // day variable declare in above
	        		ele.click();
	        		break;
	        	}
	        }
		
	}

}
