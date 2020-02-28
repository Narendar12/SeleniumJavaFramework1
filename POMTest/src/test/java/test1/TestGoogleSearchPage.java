package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestGoogleSearchPage {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Reports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test = extent.createTest("GoogleSearchPageTest",  "this test is for validating google search page");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		test.log(Status.INFO, "Starting test case");
		driver.get("https://google.com");
		test.pass("navigated to goolge.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("automation");
		test.pass("entered text successfully");
				
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		test.pass("clicked the page successfully");
		
		driver.close();
		test.pass("closed the browser");
		driver.quit();
		
		test.info("test completed");
		
		extent.flush(); 
		
		
		
		
		
		

	}

}
