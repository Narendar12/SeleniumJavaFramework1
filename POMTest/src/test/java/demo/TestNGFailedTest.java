package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFailedTest {
	
	@Test
	public void test1()
	{
		System.out.println("this is test one");
	}
	
	@Test
	public void test2()
	{
		System.out.println("this is test two");
		//int i = 1/0;
	}

	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void test3()
	{
		System.out.println("this is test three");
		Assert.assertTrue(false);
	}
}
