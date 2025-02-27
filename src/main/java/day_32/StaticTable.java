package day_32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//1) Find total rows in table
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows " +rows);
		
		//2) find the total number of columns
		
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
		System.out.println("Number of columns " +columns);
		
		//3) Read Specific data from table(ex: 5th row and 1st col)
		
		WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]"));
		
		System.out.println(data.getText());
		
		
		//4) Read the data from all the rows and columns
		
		/*System.out.println("BookName" + "\t" +"Author"+ "\t" +"Subject" +"\t" + "Price");
		for(int r = 2 ; r<=rows ; r++) {
			
			for(int c = 1; c<=columns; c++) {
				
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText()	;
				System.out.print(value+ "\t");
			}
			
			System.out.println();
		}*/
		
		//4) Print the data whose author is Mukesh
		
		/*for(int r=2 ; r<=rows ; r++) {
			
			String authName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			//System.out.println(authName);
			
			if(authName.equals("Mukesh")) {
				
				String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				
				System.out.println(BookName +"\t"+ authName);
			}
		
		
		
		}*/
		
		//5) Find the total price of all the books
		int total = 0;
		for(int r=2 ; r<=rows ; r++) {
			
			String Price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			
			total = total + Integer.parseInt(Price);
		}
		
		System.out.println(total);
		
		
	}

}
