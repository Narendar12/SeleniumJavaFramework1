package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.GoogleSearchPageObjects;

public class GoogleSearchPageObjectsTest {
	
	public static WebDriver driver = null;
	
	
	public static void main(String[] args)
	{ 
		googleSearchTest();
	
	}
	
	public static void googleSearchTest()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		GoogleSearchPageObjects searchpage = new GoogleSearchPageObjects(driver);
		
		searchpage.settextinsearchbox("automation");
		searchpage.clicksearcbutton();
		
		driver.close();
		
		
		
	}
	
	
	
	

}
