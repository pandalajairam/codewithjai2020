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
public class Test3 extends BaseClass{
	//Logger logger = null;
	static Logger logger = LogManager.getLogger(Test3.class);
	@Before
	public void setUpBeforeClass() {
		logger.info("In Before class Test3");
		//logger = Log4jConfigExample.init(this.getClass());
	}

	@Test
	public void testApp3() {
		logger.info("Logging from Test3-1");
		logger.info("Logging from Test3-2");
		logger.info("Logging from Test3-3");
		int div = 1/0;
		logger.info("Logging from Test3-4");
		logger.info("Logging from Test3-5");
		UtilityClass.printmessages();
		Assert.assertTrue(true);
	}

}
