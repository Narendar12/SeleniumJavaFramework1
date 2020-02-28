package test1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.GoogleSearchPage;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args)
	{
		googlesearchtest();
	}

	public static void googlesearchtest()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		GoogleSearchPage.textbox_search(driver).sendKeys("selenium");
		GoogleSearchPage.search_button(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		
		
		
	}
	
}
