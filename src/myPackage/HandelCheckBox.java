package myPackage;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandelCheckBox {

	public static void main(String[] args) throws InterruptedException {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
						
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		
		
		List<WebElement> checkBoxes =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@name,'color')]"));
		System.out.println("Number of check boxes:"+checkBoxes.size()); //print how many checkbox 
		
		/*
		//1.Checking all checkboxes 
		
		//using for loop
		for(int i=0;i<checkBoxes.size();i++) {
			checkBoxes.get(i).click();
		}
		*/
		
		/*
		// using for each loop
		for(WebElement chBox:checkBoxes) {
			chBox.click();
		}
		
		*/
		
		
		/*
		// 3.Checked specific checkbox based upon choice
		for(WebElement chBox:checkBoxes) {
			String checkBoxName = chBox.getAttribute("value");
			if(checkBoxName.equals("blue") || checkBoxName.equals("red")) {
				chBox.click();
			}
		}
		*/
		
		/*
		// 4. Select Last 2 check boxes
		// Total no of check boxes - no of check boxes want to select = starting index 
		// 6-2 = 4. so starting index is 4 and then check 5 and check 5 so it will check last 2 check box
		int totalCheckBoxes = checkBoxes.size();
		for(int i = totalCheckBoxes-2; i<totalCheckBoxes; i++) {
			checkBoxes.get(i).click();
		}
		*/
		
		
		// 5. Select first 2 check boxes its means first 2 index 0 and 1. 
		for(int i = 0; i<checkBoxes.size(); i++) {
			if(i<2) {
				checkBoxes.get(i).click();
				
			}
		}
		
	}

}
