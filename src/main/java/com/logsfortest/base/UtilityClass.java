package com.logsfortest.base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class UtilityClass {
	static Logger logger = LogManager.getLogger(UtilityClass.class);	
	public static void printmessages()
	{
		logger.info("Logger from utility class");
	}

}
