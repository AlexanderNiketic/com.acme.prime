package org.example.osgi;

import org.osgi.service.log.LogService;

public class HelloWorld extends Thread {
	
	@Override
	public void run(){
		System.out.print("Hello World!");
		while (!isInterrupted()){
			try {
				Activator.logService.log(LogService.LOG_INFO, "Hello Word sleeping");
				sleep(5000);
			} catch(InterruptedException e) {
				break;
			}
		}
	}
}
