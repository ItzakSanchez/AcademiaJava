package com.edgaritzak.logger;

public class Main {

	public static void main(String[] args) {
		
		//different reference variables, same instance
		Logger l1 = Logger.getInstance();
		Logger l2 = Logger.getInstance();
		Logger l3 = Logger.getInstance();
		
		// Call writeLog() method from different variable with the same instance. Add a log to the string
		l1.writeLog("Variable1 - Hello");
		l2.writeLog("Variable2 - Salut");
		l3.writeLog("Variable3 - Hallo");
		l1.writeLog("Variable1 - 你好");
		l2.writeLog("Variable2 - こんにちは");
		l3.writeLog("Variable3 - 안녕하세요");
		
		//Show the all logs
		Logger.showLogs();
				
		//remove all logs
		Logger.clearLogs();
		
		//add a new log
		l1.writeLog("Variable1 - Hola");
		
		//show all logs
		Logger.showLogs();
	}

}
