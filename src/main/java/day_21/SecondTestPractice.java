package day_21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SecondTestPractice {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		String act_title = driver.getTitle();
		
		System.out.println(act_title);
		
		if(act_title.equals("nopCommerce demo store")){
		
		System.out.println("Title is correct...");
		
	}
	else {
		
		System.out.println("Title is incorrect...");
	}
	
		//try {
	Thread.sleep(3000);
		/*}
		catch(Exception E) {
			System.out.println(E.getMessage());
			
		}
*/
	//name
	/*WebElement srch = driver.findElement(By.name("q"));
	
	srch.sendKeys("ABC");
	*/
	
	//id
	
	WebElement srch = driver.findElement(By.id("small-searchterms"));
	
	srch.sendKeys("ABC");
	
	//linkText and Partial LinkText    // only for Link
	
	//driver.findElement(By.linkText("Build your own computer")).click();  //LinkText
	
	//driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
	
	
	//driver.findElement(By.partialLinkText("Apple MacBook ")).click();
	
	//className
	
	List<WebElement> List1 = driver.findElements(By.className("list"));
	
	System.out.println(List1.size());
	
	
	List<WebElement>  aList = driver.findElements(By.tagName("a"));
	
	System.out.println(aList.size());
	
	//driver.findElement(By.id("xyz"));  //NoSuchElementException
	
	List<WebElement> ele = driver.findElements(By.id("xyz"));
  	//driver.quit();
	}
	
}
