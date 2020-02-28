package demoLogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("\n Hello World... !    \n");
		
		logger.trace("this is a trace message");		 
		logger.info("this is information message");
		logger.error("this is error message");
		logger.warn("this is a warn message");
		logger.fatal("this is a fatal message");
		
		System.out.println("\n Completed");

	}

}
