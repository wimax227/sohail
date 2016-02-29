package com.sohail.tutorial.threading;

public class ThreadClient {
	
	public static void main(String[] args){
		
		System.out.println("Started......");
        System.out.println(Thread.currentThread().getName());
		Runner runner= new Runner();
		Thread t1=new Thread(runner);
		Thread t2=new Thread(runner);
		t1.setName("Zaman");
		t1.setPriority(1);
		t1.start();
		
		t2.setName("Sohail");
		t2.start();
		
//		runner.setName("Zaman");
//		Runner runner2= new Runner();
//		runner2.setName("Sohail");
//		
////		run.run();
//		runner.start();
//		runner2.start();
		System.out.println("finished......");
	}

}
