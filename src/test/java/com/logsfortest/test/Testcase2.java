package com.logsfortest.test;

import org.junit.Before;
import org.junit.Test;

import com.logsfortest.base.BaseClass;
import com.logsfortest.base.Main3;
import com.logsfortest.base.Main4;
import com.logsfortest.base.UtilityClass;

public class Testcase2 extends BaseClass{
	//Logger logger = null;
	Main3 main3 = new Main3();
	Main4 main4 = new Main4();
	@Before
	public void setUpBeforeClass() {
		//logger.info("In Before class Tescase2");
		//logger = Log4jConfigExample.init(this.getClass());
	}

	@Test
	public void testApp1() {
		logger.info("Logging from Test2-1");
		logger.info("Logging from Test2-2");
		logger.info("Logging from Test2-3");
		logger.info("Logging from Test2-4");
		logger.info("Logging from Test2-5");
		UtilityClass.printmessages();
		main3.testApp3();
		main4.testApp4();
		int div = 1/0;
	}

}
