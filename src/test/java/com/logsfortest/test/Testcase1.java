package com.logsfortest.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.logsfortest.base.*;
import com.logsfortest.base.UtilityClass;


public class Testcase1 extends BaseClass{
	Main1 main1 = new Main1();
	Main2 main2 = new Main2();
	//Logger logger = null;
	@Before
	public void setUpBeforeClass() {
		logger.info("In Before Testcase1");
		//logger = Log4jConfigExample.init(this.getClass());
	}

	@Test
	public void testApp1() {
		logger.error("Logging from Test1-1");
		logger.info("Logging from Test1-2");
		logger.warn("Logging from Test1-3");
		logger.debug("Logging from Test1-4");
		logger.fatal("Logging from Test1-5");
		UtilityClass.printmessages();
		Assert.assertTrue(false);
		main1.testApp1();
		main2.testApp2();
	}

}
