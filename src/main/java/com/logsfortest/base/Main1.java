package com.logsfortest.base;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Main1 {
	static Logger logger = LogManager.getLogger(Main1.class);	
	//Logger logger = null;

	@Before
	public void setUpBeforeClass() {
		//logger = Log4jConfigExample.maininit("Mainlogger1");
	}

	@Test
	public void testApp1() {
		logger.info("Logging from Main1-1");
		logger.debug("Logging from Main1-2");
		logger.warn("Logging from Main1-3");
		logger.trace("Logging from Main1-4");
		logger.error("Logging from Main1-5");
		Assert.assertTrue(true);
	}

}
