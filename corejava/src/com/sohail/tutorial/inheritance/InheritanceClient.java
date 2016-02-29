package com.sohail.tutorial.inheritance;

public class InheritanceClient {

	public static void main(String[] args) {
		Employee fasi= new Employee(123, "fasi", "finance");
		Employee sami=new Employee(345, "sami","software");
		
		FinancialEmployee fe= new FinancialEmployee(123, "junaid", "banking",5);
		System.out.println(fe.getName());
System.out.println(fe.getTieColor());		
		SoftwareEmployee se= new SoftwareEmployee(345, "rashid", "java",7);
		System.out.println(se.getEmpId());
		System.out.println(se.getTieColor());

	}

}
