package com.logsfortest.test;

import org.junit.Assert;
import org.junit.Test;

import com.logsfortest.base.BaseClass;


/**
 * Unit test for simple App.
 */
public class Test4 extends BaseClass{
	//Logger logger = Log4jConfigExample.init(this.getClass());
	//static Logger logger = LogManager.getLogger("Test2");

@Test
	public void testApp4() {
		logger.info("Logging from Test4-1");
		logger.info("Logging from Test4-2");
		logger.info("Logging from Test4-3");
		logger.info("Logging from Test4-4");
		Assert.assertTrue(true);
		//Log4jConfigExample.resetAppender();
	}
@Test
	public void testApp5() {
		logger.info("Logging from Test5-1");
		logger.info("Logging from Test5-2");
		logger.info("Logging from Test5-3");
		logger.info("In the try block testApp5 method in the Test4 class");	
		int div = 1/0;
		logger.info("Logging from Test5-4");
		Assert.assertTrue(true);
		//Log4jConfigExample.resetAppender();
	}
}
