package day_33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//li/a[text()='4']")));	
		
		//String Pages = driver.findElement(By.xpath("//li/a[text()='4']")).getText();
		
		int total_Pages=driver.findElements(By.xpath("//ul/li/a[@href='#']")).size();
		
		//System.out.println(Pages);
		
		//int total_pages = Integer.parseInt(Pages);
		
		for(int p=1; p<=total_Pages; p++) {
			
			if(p>1) {
				driver.findElement(By.xpath("//li/a[text()="+p+"]")).click();
				Thread.sleep(2000);
			}
			
			//count the rows
			
			int rows=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr")).size();
			
			for(int r = 1; r<=rows; r++) {
				
				String name = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[2]")).getText();
				String price = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[3]")).getText();
				WebElement checkBox =driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[4]/input"));
				checkBox.click();
				System.out.println(name+ "\t" +price);
				
				if(checkBox.isSelected()) {
					
					System.out.println("CheckBox are selected");
				}
			}
		}
		
	
	}

}
