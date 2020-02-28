package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage { 
	
	private static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		
		return element;
	}
	

	public static WebElement search_button(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
		
		return element;
	}
}
