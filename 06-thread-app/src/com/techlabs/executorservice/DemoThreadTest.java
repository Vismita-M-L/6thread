package com.techlabs.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoThreadTest {

	public static void main(String[] args) {
		ExecutorService service=Executors.newCachedThreadPool();
		DemoThread demo = new DemoThread();
		
		 Future future=service.submit(demo);
		 System.out.println("Task Done?:"+future.isDone());
		 try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Task Done?:\"+future.isDone()");
		 
		

	}

	}


