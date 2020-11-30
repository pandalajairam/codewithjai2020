package com.logsfortest.base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log {
	
	public static void write(String message, Logger logger)
	{
		logger.info(message);
	}

}
