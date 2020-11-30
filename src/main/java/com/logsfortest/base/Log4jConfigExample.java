/*package com.logsfortest.base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Log4jConfigExample {

	static FileAppender fa = null;
	static FileAppender famain = null;
	static Logger logger = null;
	static Logger mainlogger = null;
	static ConsoleAppender console = null;

	public void testMethod() {
		logger.debug("Hello... In test method!");
	}

	public static Logger init(Class className) {
		String[] fileName = className.getName().split("\\.");
		logger = LogManager.getLogger(className);
		//logger.removeAllAppenders();
		fa = new FileAppender();
		// fa.setName("SET NAME");
		fa.setFile(fileName[2] + "." + fileName[3] + ".log");
		fa.setLayout(new PatternLayout("%d %-3p %l %m%n"));
		// fa.setLayout(new PatternLayout("%-5p [%t]: %m%n"));
		// fa.setLayout(new PatternLayout("%d %-3p %l %m%n"));
		fa.setThreshold(Level.INFO);
		fa.setAppend(false);
		fa.activateOptions();
		logger.addAppender(new ConsoleAppender(new PatternLayout("%d %-3p %C.%M%l %m%n")));
		// add appender to any Logger (here is root)
		logger.addAppender(fa);
		
		 * console = new ConsoleAppender(); // create appender // configure the
		 * appender String PATTERN = "%d [%p|%C|%C] %M%n"; console.setLayout(new
		 * PatternLayout(PATTERN)); console.setThreshold(Level.FATAL);
		 * console.activateOptions(); logger.addAppender(console);
		 
		// repeat with all other desired appenders
		return logger;
	}
	
	public static Logger getLogger() {
		return logger;
	}

	public static Logger maininit(String className) {
		if (mainlogger == null) {
			Path path = Paths.get(System.getProperty("user.dir")+File.separator+"main.log");
		    try { 
	            Files.deleteIfExists(path); 
	        } 
	        catch (IOException e) { 
	            e.printStackTrace(); 
	        } 
			mainlogger = Logger.getLogger(className);
			mainlogger.removeAllAppenders();
			famain = new FileAppender();
			famain.setFile("main.log");
			famain.setLayout(new PatternLayout("%d %-3p %l %m%n"));
			famain.setThreshold(Level.INFO);
			famain.setAppend(true);
			famain.activateOptions();
			mainlogger.addAppender(famain);
		}
		return mainlogger;
	}

	
	 * public static void resetAppender() { //fa.close();
	 * logger.removeAllAppenders(); }
	 

	public static void main(String[] args) {

		// Set up a simple configuration that logs on the console.
		BasicConfigurator.configure();
		logger.info("Logging started application.");
		Log4jConfigExample example = new Log4jConfigExample();
		example.testMethod();
		logger.info("Close application.");
	}

}
*/