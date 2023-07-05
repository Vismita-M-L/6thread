package com.techlabs.executorservice;

import java.util.concurrent.Callable;

public class DemoThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(500);
		return "Executor service Demo";
	}
	
	

}
