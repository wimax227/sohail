package com.sohail.tutorial.inheritance.abstractionExample;

import com.sohail.tutorial.inheritance.Employee;
import com.sohail.tutorial.inheritance.FinancialEmployee;
import com.sohail.tutorial.inheritance.SoftwareEmployee;

public class ClassCastClient {

	public static void main(String[] args) {
		FinancialEmployee fe= new FinancialEmployee(123, "junaid", "banking",5);
		castmethod(fe);
		SoftwareEmployee se= new SoftwareEmployee(345, "rashid", "java",7);
		castmethod(se);
	     int i = 3;
	     Integer intobj= i; //Auto boxing
	}
	
	public static void castmethod(Employee emp){
//	 System.out.print(emp.getName());
	 
	 if (emp instanceof FinancialEmployee){
	 FinancialEmployee fe= (FinancialEmployee)emp;
	 System.out.println(fe.getFinancialExp());
	 }
	 if (emp instanceof SoftwareEmployee){
	 SoftwareEmployee se= (SoftwareEmployee)emp;
	 System.out.println(se.getjavaExp(8));
	 }
	}
	
	

}
