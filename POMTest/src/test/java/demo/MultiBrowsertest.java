package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowsertest {
	
	WebDriver driver= null;
	String projectpath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName)
	{
		System.out.println("browser name is :" + browserName);
		System.out.println("the threadcount is:" + Thread.currentThread().getId());
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectpath + "/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectpath + "/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectpath + "/Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
				
			}
	}

	@Test
	public void browserLoginTest()
	{
		driver.get("https://www.google.com");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
