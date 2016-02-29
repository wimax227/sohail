package com.sohail.tutorial.exceptioneg;

public class ThrowsException {

	public static void main(String[] args)  {
//		
//		try {
//			PrintValue.printeg(args);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		
		
			try {
				PrintValue.addonewithsomething(4, 2);
			} catch (NotoneExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		System.out.println("I am good");



	}

	
}
