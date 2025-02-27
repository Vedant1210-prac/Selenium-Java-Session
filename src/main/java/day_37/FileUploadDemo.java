package day_37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();
		
		
		//1) Uploading Single File
		
		/*driver.findElement(By.cssSelector("input#filesToUpload")).sendKeys("C:\\Users\\VEBHURE\\OneDrive - Capgemini\\Desktop\\Dummy.txt");
	
		String FileName = driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText();
		
		if(FileName.equals("Dummy.txt")) {
			
			System.out.println("Uploaded successfully");
		}*/
		
		
		//2) Uploading multiple files
		
		String file1 = "C:\\\\Users\\\\VEBHURE\\\\OneDrive - Capgemini\\\\Desktop\\\\Dummy.txt";
		String file2 = "C:\\Users\\VEBHURE\\OneDrive - Capgemini\\Desktop\\Dummy 2.txt";
	 
		driver.findElement(By.cssSelector("input#filesToUpload")).sendKeys(file1+ "\n" +file2);
		
		int noOffFile = driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
		
		
		if(noOffFile == 2) {
			
			System.out.println("both files are uploaded");
		}
	}

}
