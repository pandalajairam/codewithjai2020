package com.logsfortest.base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Main3 {
	//Logger logger = null;
	static Logger logger = LogManager.getLogger(Main3.class);	
	@Before
	public void setUpBeforeClass() {
		//logger = Log4jConfigExample.maininit("Mainlogger1");
		logger.info("Main 3");
	}

	@Test
	public void testApp3() {
		logger.info("Logging from Main3-1");
		logger.info("Logging from Main3-2");
		logger.info("Logging from Main3-3");
		logger.info("Logging from Main3-4");
		logger.info("Logging from Main3-5");
		Assert.assertTrue(true);
	}

}
