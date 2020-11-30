package com.logsfortest.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.logsfortest.test.Test1;
import com.logsfortest.test.Test2;
import com.logsfortest.test.Test3;
import com.logsfortest.test.Test4;
import com.logsfortest.test.Testcase1;
import com.logsfortest.test.Testcase2;;

public class Driver {

	protected static Logger logger = LogManager.getLogger(Driver.class);
	//static Properties prop = null;
	static List<Class<? extends BaseClass>> klasses = null;
	static String classname = "";

/*	static {
		// PropertiesConfigurator is used to configure logger from properties
		// file
		PropertyConfigurator.configure("log4j.properties");
		
	}*/

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		try {
			klasses = readInput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Class<? extends Object> klass : klasses) {
			try{
				classname = klass.getSimpleName();
			System.setProperty("logfile.name",classname+".log");
			System.out.println("Log file name is "+classname+".log");
			 //Result result = JUnitCore.runClasses(klass);
			 JUnitCore.runClasses(klass);
		 /*       for (Failure failure : result.getFailures()) {
		            logger.info(failure.toString());
		            failure.getException().printStackTrace();
		        }*/
			}
			catch(Exception e)
			{
				logger.error(e.getMessage());
			}
		}

	}

	
	public static Properties readPropertiesFile(String fileName) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (fis != null)
				fis.close();
		}
		return prop;
	}

	public static List<Class<? extends BaseClass>> readInput() throws Exception {
		logger.info("Getting the classes list");
		return Arrays.asList(Test1.class, Test2.class,Testcase1.class, Testcase2.class,Test3.class, Test4.class);

	}
}
