package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownSortedTest {

	public static void main(String[] args) {
		//With import other package for Web drive
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
						
		driver.get("https://twoplugs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		//get the drop down element
		WebElement drpElement = driver.findElement(By.name("category_id")); // Element set in a WebElement variable
		
		Select drpSelect = new Select(drpElement);
		
		List<WebElement> options = drpSelect.getOptions();
		
		ArrayList orginalList = new ArrayList(); //create arraylist 
		ArrayList tempList = new ArrayList();
		
		for(WebElement option:options) { //all options will catch one by one in option variable
			orginalList.add(option.getText()); // add the single single option in orginalList 
			tempList.add(option.getText()); // add the single single option in orginalList 
			
		}
		System.out.println("Orginal List:"+orginalList);
		System.out.println("Temp List:"+tempList);
		
		Collections.sort(tempList); //Shorting the collection// collection is predefine class contain sort metthod
		
		System.out.println("Orginal List After sorting:"+orginalList);
		System.out.println("Temp List After sorting:"+tempList);
		// Now compare  
		if(orginalList.equals(tempList)) {
			System.out.println("DropDown Sorted...");
		}else {
			System.out.println("DropDown UnSorted...");
		}
		
		driver.close();
	}

}
