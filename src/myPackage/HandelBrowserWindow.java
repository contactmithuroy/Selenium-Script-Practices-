package myPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandelBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
						
		driver.get("https://opensource-demo.orangehrmlive.com"); // parent window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		
		//getWindowHandle() geting new window id 
		String windowId =  driver.getWindowHandle(); // return ID of the single browser window string value
		System.out.println("Window ID: "+windowId); // Window ID: 6FC83D92062D9DD2228DC05C17E3A259
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click(); // opens another browser and is a child window
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click(); // opens another browser and is a child window
		
		//returns id of multiple browser window
		Set<String> windowIds = driver.getWindowHandles(); 
		
		/*
		//First method iterator()
		Iterator<String> it= windowIds.iterator();
		
		String parentWindowId = it.next(); //catch window id one by one 
		String childWindowId = it.next();
		
		System.out.println("Parent Window ID: "+parentWindowId);
		System.out.println("Child Window ID: "+childWindowId);
		*/
		
		/*
		// Second Method - using List/ArrayList
		List<String> windowIdList = new ArrayList(windowIds); // convert Set --> List
		String parentWindowId = windowIdList.get(0); //Using Get Mehtod Parent window ID
		String childWindowId = windowIdList.get(1); //Using Get Method Child window ID
		
		System.out.println("Parent Window ID: "+parentWindowId);
		System.out.println("Child Window ID: "+childWindowId);
		
		
		//How to use window Id's for switching
		driver.switchTo().window(parentWindowId);	
		System.out.println("Parent window title: "+driver.getTitle());
		
		driver.switchTo().window(childWindowId);
		System.out.println("Child window title: "+driver.getTitle());
		 */
		
		/*
		// Third Way using for each loop
		List<String> windowIdsList = new ArrayList(windowIds); //convert Set --> List
		for(String winId:windowIdsList) {
			// System.out.println(winId);
			String title = driver.switchTo().window(winId).getTitle(); // Switch to window
			System.out.println(title);
		}
		driver.close(); // window close single browser which is pointing // in this case child windo will be close	
		driver.quit(); // closed the all browser window
		*/
		
		//close only parent window
		List<String> windowIdsList = new ArrayList(windowIds);
		for(String winId:windowIdsList) {
			String title = driver.switchTo().window(winId).getTitle(); // Switch to window
			if(title.equals("OrangeHRM")) {
				driver.close();
			} // only Child browser window will be open in this case
		}
		
		
	}
}
