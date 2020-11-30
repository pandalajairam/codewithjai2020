package com.logsfortest.base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Main4 {
	//Logger logger = null;
	static Logger logger = LogManager.getLogger(Main4.class);	
	@Before
	public void setUpBeforeClass() {
		logger.info("Main 4");
	}

	@Test
	public void testApp4() {
		logger.info("Logging from Main4-1");
		logger.info("Logging from Main4-2");
		logger.info("Logging from Main4-3");
		logger.info("Logging from Main4-4");
		logger.info("Logging from Main4-5");
		Assert.assertTrue(true);
	}

}
