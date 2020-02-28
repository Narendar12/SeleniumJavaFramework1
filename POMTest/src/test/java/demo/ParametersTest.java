package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	@Parameters({"Myname"})
	@Test
	public void test1(@Optional("Raghav") String name)
	{
		System.out.println("Name is:" + name);
	}

}
