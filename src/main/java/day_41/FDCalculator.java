package day_41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		
		
		String filePath = System.getProperty("user.dir")+"\\testdata\\CalData.xlsx";
		
		int row = ExcelUtils.getRowNum(filePath, "Sheet1", 2);
		
		for(int i = 1; i<=row ; i++) {
			
			//1) Read the data from 
			
			String principalVal = ExcelUtils.getCelldata(filePath, "Sheet1", i, 0);
			String rate_I = ExcelUtils.getCelldata(filePath, "Sheet1", i, 1);
			String per1 = ExcelUtils.getCelldata(filePath, "Sheet1", i, 2);
			String per2 = ExcelUtils.getCelldata(filePath, "Sheet1", i, 3);
			String frequency = ExcelUtils.getCelldata(filePath, "Sheet1", i, 4);
			String exp_mvalue = ExcelUtils.getCelldata(filePath, "Sheet1", i, 5);
			
			
			//2) pass above data into application
			
			driver.findElement(By.xpath("//input[@name='principal']")).sendKeys(principalVal);
			driver.findElement(By.xpath("//input[@name='interest']")).sendKeys(rate_I);
			driver.findElement(By.xpath("//input[@name='tenure']")).sendKeys(per1);
			
			Select perdrp = new Select(driver.findElement(By.xpath("//select[@name='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			
			Select frqdrp = new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
			frqdrp.selectByVisibleText(frequency);
			
			
			
			driver.findElement(By.xpath("//div[@class='CTR PT15']/a[1]")).click();
			
			String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']")).getText();
			
			//3) Validation
			
			double exp_value = Double.parseDouble(exp_mvalue);
			double act_value = Double.parseDouble(act_mvalue);
			
			if(exp_value==act_value) {
				
				System.out.println("Test passed");
				ExcelUtils.SetCelldata(filePath, "Sheet1", i, 7, "Passed");
				ExcelUtils.fillGreencolour(filePath, "Sheet1", i, 7);
				
			}else {
				
				System.out.println("Test failed");
				ExcelUtils.SetCelldata(filePath, "Sheet1", i, 7, "Failed");
				ExcelUtils.fillRedcolour(filePath, "Sheet1", i, 7);
			}
			
			driver.findElement(By.xpath("//div[@class='CTR PT15']/a[2]")).click();
			
		}
	}

}
