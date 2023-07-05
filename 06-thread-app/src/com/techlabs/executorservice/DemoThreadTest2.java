package com.techlabs.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoThreadTest2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service=Executors.newCachedThreadPool();
		
		List<DemoThread> threads=new ArrayList<DemoThread>();
		threads.add(new DemoThread());
		threads.add(new DemoThread());
		threads.add(new DemoThread());
		threads.add(new DemoThread());
		threads.add(new DemoThread());
		
		//for(DemoThread thread:threads)
		//{
			//Future future=service.submit(threads);
			//System.out.println(future.get());
			
		//}
		System.out.println(service.invokeAny(threads));
		List<Future<String>> futures =service.invokeAll(threads);
		for(Future<String> future:futures)
		
		System.out.println(future.get());
		service.shutdown();
		
		
		

	}

}
