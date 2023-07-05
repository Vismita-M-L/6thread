package com.techlabs.executorservice;

public class MyThread implements Runnable{
	Thread t;
	public MyThread()
	{
		t=new Thread(this);
		System.out.println("Thread Created");
		t.start();
	}
	

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
	

}
