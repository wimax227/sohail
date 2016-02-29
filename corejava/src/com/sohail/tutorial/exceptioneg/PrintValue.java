package com.sohail.tutorial.exceptioneg;

public class PrintValue   {
	public static void printeg(String[] args) throws Exception{
		System.out.println(args[1]);
		
	}

	public static void addsomething(int one , int something)throws Exception{
		if(one !=1)
			throw new Exception("First value is not one..Please check");
		System.out.println(one + something);
	}
	public static void addonewithsomething(int one , int something)throws NotoneExceptions{
		if(one !=1)
			throw new NotoneExceptions("First value is not one..Please check");
		System.out.println(one + something);
	}
}
