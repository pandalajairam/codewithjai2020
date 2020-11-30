package com.logsfortest.base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Main2 {
	//Logger logger = null;
	static Logger logger = LogManager.getLogger(Main2.class);	

	@Before
	public void setUpBeforeClass() {
		logger.info("Main 2");
		//logger = Log4jConfigExample.maininit("Mainlogger1");
	}

	@Test
	public void testApp2() {
		logger.info("Logging from Main2-1");
		logger.info("Logging from Main2-2");
		logger.info("Logging from Main2-3");
		logger.info("Logging from Main2-4");
		logger.info("Logging from Main2-5");
		Assert.assertTrue(true);
	}

}
