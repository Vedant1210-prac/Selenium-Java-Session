package day_21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {

		//1)Launch the browser
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		//2) Open the URL
		
		driver.get("https://www.saucedemo.com/");
		
		//3) Validate the title
		
		String act_title = driver.getTitle();
		
		if(act_title.equals("Swag Labs")) {
			
			System.out.println("Test passed...");
		}else {
			System.out.println("Test failed");
		}
		
		//4) Close browser
		
		driver.close();
	}

}
