package com.logsfortest.base;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import org.apache.log4j.Category;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseClass {

	protected static Logger logger = LogManager.getLogger(BaseClass.class);
	static Properties prop = new Properties();

	// static FileAppender fa=null;
	@BeforeClass
	public static void setupBaseClass() {
		try {
			logger.info("Inside the BeforeClass method in the BaseClass class");
			prop = Driver.readPropertiesFile("log4j.properties");
			
			// prop.put("log4j.appender.fileAppender2","org.apache.log4j.RollingFileAppender");
			// prop.put("log4j.appender.fileAppender2.layout","org.apache.log4j.PatternLayout");
			// prop.put("log4j.appender.fileAppender2.layout.ConversionPattern","[%t]
			// %-5p %C %x - %m%n");
			prop.put("log4j.rootLogger", "INFO, fileAppender2,fileAppender");
			// prop.put("log4j.appender.fileAppender2.File", "Test1.log");
			// prop.put("log4j.rootLogger", "DEBUG, consoleAppender,
			// fileAppender2");
			// LogManager.resetConfiguration();
			PropertyConfigurator.configure(prop);
			LogManager.getRootLogger().setLevel(Level.INFO);
			System.out.println(LogManager.getRootLogger().getLevel());
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("inside baseclass @Before Annotation after 2nd appender");
	}

	@AfterClass
	public static void tearDown() {
		logger.info("inside tear down of testcase log file");
		// prop.setProperty("log4j.appender.fileAppender.File", "Test1.log");
		BaseClass.prop.put("log4j.rootLogger", "INFO, consoleAppender, fileAppender");
		// prop.put("log4j.appender.fileAppender.File", "MainLog.log");
		PropertyConfigurator.configure(BaseClass.prop);
		logger.info("Logging in main log");
		logger.info("calling utility method");
		UtilityClass.printmessages();
	}

}
