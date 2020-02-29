package com.automation.StepDefinition;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.utility.PropertiesFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YouTubeSearchStepDef {
		String projectpath = System.getProperty("user.dir");
			WebDriver driver = null;
	PropertiesFileReader obj = new PropertiesFileReader();
			
	@Given("^Open chrome browser and enter url$")
	public void open_chrome_browser_and_enter_url() throws Exception
	{
		Properties properties = obj.getProperty();
	 	System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("browser.baseURL"));
	}
	
	@When("^Enter Search criteria$")
	public void Enter_Search_criteria() throws Exception
		{
		
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("selenium by bakappa");
					
	}
	@Then("^click on Search button$")
	public void click_on_Search_button() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).sendKeys(Keys.RETURN);
		driver.close();
	}
	
}
