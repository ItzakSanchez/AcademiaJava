package com.edgaritzak.logger;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Logger {
	private static Logger instance;
	private static String log = "";
	
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	//add a log to the string
	public void writeLog(String message) {
		log= log +"["+LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS)+"]:"+message+"\n";
	}
	//print all logs
	public static void showLogs() {
		if(log.length()>1)
		System.out.println(log);
	}
	//clear all logs
	public static void clearLogs() {
		log="";
	}
}
