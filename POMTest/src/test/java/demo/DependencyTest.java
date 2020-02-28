package demo;

import org.testng.annotations.Test;

public class DependencyTest {
	@Test(dependsOnMethods = {"Test2"})
	public void Test1()
	{
		System.out.println("This is test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("This is test2");
	}

}
