package com.sohail.tutorial.threading;
public class Runner implements Runnable{ //extends Thread {
	@Override
	public  void  run(){
		synchronized(this){
//		System.out.println("Runner"+" "+ Thread.currentThread().getName());
		for(int i=0; i<5; i++){	
         try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Runner" +" "+  Thread.currentThread().getName() + i);
		}
		}
	} 

}
