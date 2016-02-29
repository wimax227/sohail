package com.sohail.tutorial.inheritance;

public class PolymorphismExample {
	
	public static void main(String[] args) {
		
		Employee emp = null;    
		emp =new FinancialEmployee(456,"tim","creditcards",4);
	    printDetails(emp);
		
		emp = new SoftwareEmployee(963,"shipra","Database");
				printDetails(emp);
				
	}	
		public static void printDetails(Employee se){
			System.out.println(se.getTieColor());
			System.out.println(se.getEmpDept());
			System.out.println(se.getEmpId());
			System.out.println(se.getName());
			
	

	}

}
