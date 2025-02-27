package day_36;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=marketplace/extension&filter_category_id=20&filter_search=club%20demo");
		
		//Open window in new Tab
		//driver.switchTo().newWindow(WindowType.TAB);
		
		
		//Open window in new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.orangehrm.com/");
		
		
	}

}
