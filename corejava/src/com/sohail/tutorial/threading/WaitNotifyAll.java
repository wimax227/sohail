package com.sohail.tutorial.threading;

public class WaitNotifyAll {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		Reader Readerone=new Reader(calc,"ONE");
		Reader Readertwo=new Reader(calc,"TW0");
		Reader Readerthree=new Reader(calc,"Three");
		
		Readerone.start();
		Readertwo.start();
		Readerthree.start();
		
		calc.start();
		
		
		
	}

}


class Reader extends Thread{
	Calculator calc;
	public Reader(Calculator calc, String name){
		this.calc=calc;
		this.setName(name);
	}
//	int totalsum=0;
	@Override
	public void run() {
		synchronized (calc) {
			System.out.println(this.getName()+ " " +"waiting for calculator to complete.....	");
			try {
				calc.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(this.getName()+   "Final value is "+ calc.totalsum);
	}
}
class Calculator extends Thread{
	
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
		notifyAll();
	}
	}}
}