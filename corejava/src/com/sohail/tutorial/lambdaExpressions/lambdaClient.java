package com.sohail.tutorial.lambdaExpressions;

public class lambdaClient {
	public static void main(String[] args){
	
//		WorkerInterface wi= new workerImpl();
//		wi.working();
//		
		WorkerInterface wi= ()-> System.out.println("I am from worker class");
		wi.working();
		
		calculator calc= new Add();
		System.out.println(calc.calc(4, 3));
		
	calc=new sub();
	System.out.println(calc.calc(4, 3));
	
	calc=(a,b)-> a/b;
     callme(calc);
	}
	
	public static void callme(Object obj){
		System.out.println(obj);
	}

}
