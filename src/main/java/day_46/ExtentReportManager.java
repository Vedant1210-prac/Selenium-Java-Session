package day_46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
	
	public static ExtentSparkReporter reporter; //UI of the report
	public static ExtentReports extent; //populate common data on the report
	public static ExtentTest test; //create the testcase entries in report and update the status of the report
	
public void onStart(ITestContext context) {
	    
		
		reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html"); // file path
		 
		reporter.config().setDocumentTitle("Automtion Test");  // title of the report
		reporter.config().setReportName("Dummy Testing");   // report name
		reporter.config().setTheme(Theme.DARK);   // set the theme of the report
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("CommputerName", "CG");
		extent.setSystemInfo("Enviornment", "preprod");
		extent.setSystemInfo("Tester Name", "Vedant");
		extent.setSystemInfo("Windows", "Windows10");
		extent.setSystemInfo("browser name", "chrome");
		
		
	
	
	  }
	
	/*public void onTestStart(ITestResult result) {
		
	  }*/
	
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName()); // create- new entry in report
		test.log(Status.PASS, "Test is Passed " + result.getName());  // update status pass/fail/skip
		
		
	  }

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test is failed" + result.getName());
		test.log(Status.FAIL, "Test is failed "+ result.getThrowable());
		
		
		
	  }
	
	public void onTestSkipped(ITestResult result) {

		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test is Skipped" +result.getName());
		
	  }
	
	public void onFinish(ITestContext context) {

		extent.flush();
		
	  }

}
