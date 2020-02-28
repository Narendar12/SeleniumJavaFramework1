package demoLogger;

public class ExceptionHandling {

	public static void main(String[] args)
	{
		try
		{
		demo();
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		public static void demo() throws Exception
		{
		System.out.println("Hello World");
		int a = 1/0;
		System.out.println("this is a test");
	}
		
}