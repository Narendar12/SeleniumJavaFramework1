package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test1.TestNG_Demo;

public class PropertiesFileReader {
	
	public static Properties prob = new Properties();
	public static String projectpath =System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
		
	}
		
		
		public static void getProperties()
		{
			try
			{
			InputStream input = new FileInputStream(projectpath + "/src/test/java/config/config.properties");
			prob.load(input);
			String browser = prob.getProperty("browser");
			System.out.println(browser);
			TestNG_Demo.browsername = browser;
			} catch(Exception exp)
			{
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			
		}
		public static void setProperties()
			{
				try
				{
				OutputStream output = new FileOutputStream(projectpath + "/src/test/java/config/config.properties");
				prob.setProperty("browser","chrome");
				prob.store(output, "writing to file");
				
				} catch(Exception exp)
				{
					System.out.println(exp.getMessage());
					System.out.println(exp.getCause());
					exp.printStackTrace();
				}
			
		}

	}
