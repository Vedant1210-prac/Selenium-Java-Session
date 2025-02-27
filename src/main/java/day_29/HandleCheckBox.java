package day_29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleCheckBox {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
		
		driver.manage().window().maximize();
		
		//Select Check box
	
		WebElement checkBox = driver.findElement(By.xpath("//tr[1]/td/input[@type='checkbox']"));
		
		System.out.println("Check box is selected " + checkBox.isSelected());
		
		WebElement checkBox2 = driver.findElement(By.xpath("//tr[2]/td/input[@type='checkbox']"));
		
		//checkBox2.click();
		
		System.out.println(checkBox2.isSelected());
		
		//Capturing all the checkboxes
		
	List<WebElement> checkBoxes	=driver.findElements(By.xpath("//tr/td/input[@type='checkbox']"));
		
	System.out.println("number of check boxes are " +checkBoxes.size());
	
	/*//Selecting all the checkBoxes
	
	for(int i=0 ; i<=checkBoxes.size()-1; i++) {
		
		checkBoxes.get(i).click();
	}*/
	
	//Selecting last 2 check boxes
	// 5-2= 3
	
	/*for(int i=3; i<=checkBoxes.size()-1; i++) {
		
		checkBoxes.get(i).click();
	}*/

	
	//5. first 3 check box
	
	/*for(int i=0; i<3; i++) {
		
		checkBoxes.get(i).click();
	}
	
	Thread.sleep(5000);
	
	for(WebElement chckBox : checkBoxes) {
		
		chckBox.click();
		
	}
	
for(WebElement chckBox : checkBoxes) {
		
	if(chckBox.isSelected()) {
		chckBox.click();
	}
	else {
		chckBox.click();
	}*/
	
	
	
	//7 Specific check box selection
	
	/*for(int i = 0; i<=checkBoxes.size()-1; i++) {
		
		if(i == 0 || i == 2 || i==4) {
			
			checkBoxes.get(i).click();
		}*/
	
	
	String itemname = "Tablet" ;
			
			switch(itemname){
		
		case "Laptop" : driver.findElement(By.xpath("//td[text()='Laptop']")).click();
		break;
		
		case "Smartphone" : driver.findElement(By.xpath("//td[text()='Smartphone']")).click();
		break;
		
		case "Tablet" : driver.findElement(By.xpath("//td[text()='Tablet ']")).click();
		break;
		
		case "Smartwatch" : driver.findElement(By.xpath("//td[text()='Smartwatch']")).click();
		break;
		
		case "Wireless Earbuds" : driver.findElement(By.xpath("//td[text()='Wireless Earbuds']")).click();
		break;
		
		default: System.out.println("Default item");
		
	}
	
	
	
	
	}

}
