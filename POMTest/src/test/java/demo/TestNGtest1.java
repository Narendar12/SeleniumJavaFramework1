package demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGtest1 {
	
	
	@Test(priority =0)
	public void test1()
	{
		System.out.println("This is test1");
		
	}
	@Test(dependsOnMethods = {"test3"})
	public void tes2()
	{
		System.out.println("This is test2");
		
	}
	
	@Parameters({"Myname"})
	@Test
	public void test3(String Name)
	{
		System.out.println("This is test3 with parameter:" + Name);
		
	}
	
	@Test(alwaysRun = true)
	public void test4()
	{
		System.out.println("This is test4");
		
	}
	
	@Test(groups = {"sanity"})
	public void test5()
	{
		System.out.println("This is test5");
		
	}
	
}
