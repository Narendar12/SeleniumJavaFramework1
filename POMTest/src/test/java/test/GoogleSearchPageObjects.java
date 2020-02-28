package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
		
	By text_boxsearch = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input");
	By search_button = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]");
	
	public GoogleSearchPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public void settextinsearchbox(String text)
	{
	 driver.findElement(text_boxsearch).sendKeys(text);
	}
	
	public void clicksearcbutton()
	{
	 driver.findElement(search_button).sendKeys(Keys.RETURN);
	
	}

}
