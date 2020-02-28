package demo;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class TestNGGrouptest {
	
	@Test(groups = {"Sanity"})
	public void test1()
	{
		System.out.println("i am part of Sanity");
	}
	@Test(groups = {"windows.regression"})
	public void test2()
	{
		System.out.println("i am part of Sanity and smoke");
	}
	@Test(groups = {"linux.regression"})
	public void test3()
	{
		System.out.println("i am part of Smoke and Regression");
	}
	
}
