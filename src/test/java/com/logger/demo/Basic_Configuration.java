package com.logger.demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.jmx.LoggerDynamicMBean;

public class Basic_Configuration { 
	
	// factory design pattern
	 static Logger log  = Logger.getLogger(Basic_Configuration.class);
	
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		log.debug("debug");
		log.info("info");
		log.warn("warnning");
		log.error("error");
		log.fatal("fetal");
		
		
	}
	
	
	

}
