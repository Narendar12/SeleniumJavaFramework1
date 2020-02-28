package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestNGExtentReport {
	
	static ExtentHtmlReporter htmlReporter ;
	
	static ExtentReports extent;
	
    static WebDriver driver = null;
	
    
    @BeforeSuite
	public void setUp()
	{
		
		htmlReporter = new ExtentHtmlReporter("Reports1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}

   @Test
public void test() throws Exception
{
	ExtentTest test = extent.createTest("my google search page test", "validating google search page test");
	test.log(Status.INFO, "Starting test case");
	driver.get("https://google.com");
	test.pass("navigating to the google page successfully");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.name("q")).sendKeys("automation");
	test.pass("entered text successfully");
			
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
	test.pass("clicked the page successfully");	
	
	 // test with snapshot
    test.addScreenCaptureFromPath("screenshot.png");
}

@AfterTest
public void tearDowmTest()
{
	
	driver.close();
	driver.quit();
		
}
@AfterSuite
public void testDown()
{
	extent.flush();
}

}


