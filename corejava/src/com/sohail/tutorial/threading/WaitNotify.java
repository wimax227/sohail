package com.sohail.tutorial.threading;

public class WaitNotify {

	public static void main(String[] args) throws Exception {
		summer sm= new summer();
		sm.start();
		//Thread.sleep(2000);
		synchronized (sm) {
			System.out.println("waiting for summer to complete.....	");
			try {
				sm.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(sm.totalsum);
	
		
	}

}

class summer extends Thread{
	
	int totalsum=0;
	@Override
	public void run() {
	synchronized (this) {
	for (int i=0;i<=5;i++){
		totalsum += i;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		notify();
	}
	}}
}