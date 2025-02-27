package day_26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		
		//get()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//getTitle()
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//getCurrentURL()
		
		String CurrentURL = driver.getCurrentUrl();
		
		System.out.println(CurrentURL);
		
		//getPageSource() returns the source code
		
		/*String source = driver.getPageSource();
		
		System.out.println(source);
		*/
		//getWindowHandle  return the ID of the Window
		
		/*String WindowID = driver.getWindowHandle();
		
		System.out.println(WindowID);
*/
		
		//getWindowHandles
		
	
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> IDs =  driver.getWindowHandles();
		
		System.out.println(IDs);
	}

}
