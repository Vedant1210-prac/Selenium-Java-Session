package day_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCssSelector {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
	
		String act_title = driver.getTitle();
		
		if(act_title.equals("Your Store")) {
			System.out.println("We are on correct page");
		}
		else {
			System.out.println("We are on incorrect page");
		}
		
		boolean val = driver.findElement(By.cssSelector("img.img-fluid[alt='iPhone 6']")).isDisplayed();
		
		System.out.println(val);
		

	}

}
