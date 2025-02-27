package day_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathLocatorDemo {

	public static void main(String[] args) {


		ChromeDriver d = new ChromeDriver();
		
		d.get("https://demo.nopcommerce.com/");
		
		d.manage().window().maximize();
		
		//xpath with single attribute
		
		//d.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).click();
		
		//xpath with Multiple attrubute
		
			
		//d.findElement(By.xpath("//button[@type='button'][@xpath='1']")).click();
		
		//Xpath by using and and inner text
		
/*Actions action  = new Actions(d);
		
		WebElement ele = d.findElement(By.xpath("//a[text() ='Apple MacBook Pro 13-inch' and @href=\"/apple-macbook-pro-13-inch\"]"));
		
		action.scrollToElement(ele);
		
		//ele.click();
		
		
	String heading = d.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
	
	System.out.println(heading);
	
	
	//Xpath with contains
	

	boolean val = d.findElement(By.xpath("//a[contains(@title, 'Apple')]")).isDisplayed();
	
	System.out.println(val);*/
		
		
		//chained Xpath:
		
		d.findElement(By.xpath("//ul/li[@id='topcartlink']/a")).click();
		
		

	}

}
