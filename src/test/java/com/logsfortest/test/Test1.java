package com.logsfortest.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.logsfortest.base.BaseClass;
//import com.logsfortest.base.UtilityClass;
import com.logsfortest.base.UtilityClass;

/**
 * Unit test for simple App.
 */
public class Test1 extends BaseClass{
	//Logger logger = null;
	static Logger logger = LogManager.getLogger(Test1.class);
	@Before
	public void setUpBeforeClass() {
		logger.info("In Before class Test1");
		//logger = Log4jConfigExample.init(this.getClass());
	}

	@Test
	public void testApp1() {
		logger.info("Logging from Test1-1");
		logger.info("Logging from Test1-2");
		logger.info("Logging from Test1-3");
		logger.info("Logging from Test1-4");
		logger.info("Logging from Test1-5");
		UtilityClass.printmessages();
		Assert.assertTrue(false);
	}

}
