package com.logsfortest.test;

import org.junit.Assert;
import org.junit.Test;

import com.logsfortest.base.BaseClass;


/**
 * Unit test for simple App.
 */
public class Test2 extends BaseClass{
	//Logger logger = Log4jConfigExample.init(this.getClass());
	//static Logger logger = LogManager.getLogger("Test2");

@Test
	public void testApp2() {
		logger.info("Logging from Test2-1");
		logger.info("Logging from Test2-2");
		logger.info("Logging from Test2-3");
		logger.info("Logging from Test2-4");
		Assert.assertTrue(true);
		//Log4jConfigExample.resetAppender();
	}
@Test
	public void testApp2_1() {
		logger.info("Logging from Test2_1-1");
		logger.info("Logging from Test2_1-2");
		logger.info("Logging from Test2_1-3");
		logger.info("Logging from Test2_1-4");
		Assert.assertTrue(false);
		//Log4jConfigExample.resetAppender();
	}
}
