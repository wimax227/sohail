package com.sohail.tutorial.inheritance;

public class MethodOverloadingClient {

	public static void main(String[] args) {
		
		FinancialEmployee fe=new FinancialEmployee(456,"tim","creditcards");
//		System.out.println(fe.getTieColor());
		
		Employee se= new SoftwareEmployee(963,"shipra","Database");
//		System.out.println(se.getTieColor());
		
System.out.println(se);


	}

}
