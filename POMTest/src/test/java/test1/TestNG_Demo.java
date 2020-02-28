package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFileReader;

public class TestNG_Demo {

	WebDriver driver = null;
	
	public static String browsername = null;
	
		
	@BeforeTest
	public void setUpTest()
	{
		String projectpath = System.getProperty("user.dir");
		PropertiesFileReader.getProperties();
		
		if(browsername.equalsIgnoreCase("chrome"))
		{		
		System.setProperty("webdriver.chrome.driver", projectpath + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		} else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.out.println("borwser is firefox");
		}
		
	}
	
	@Test
	public void test() throws Exception
	{
		//ExtentTest test = extent.createTest("my google search page test", "validating google search page test");
		//test.log(Status.INFO, "Starting test case");
		driver.get("https://google.com");
		//test.pass("navigating to the google page successfully");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("automation");
		//test.pass("entered text successfully");
				
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		//test.pass("clicked the page successfully");	
		
		 // test with snapshot
	    //test.addScreenCaptureFromPath("screenshot.png");
	}

	@AfterTest
	public void tearDowm()
	{
		driver.close();
		//driver.quit();
			
	}
	/*
	@AfterSuite
	public void testDown()
	{
		extent.flush();
	}
	*/
	
}
