package com.sohail.tutorial.inheritance;
public class FinancialEmployee extends Employee{
	private int financialExp;
	
	public FinancialEmployee(int empID, String name, String empDept) {

		super(empID,name,empDept);
	}

   public FinancialEmployee(int empID, String name, String empDept,int financialExp) {
		super(empID,name,empDept);
		this.financialExp=financialExp;
	}
 	public int getFinancialExp() {
		return financialExp;
	}

	public void setFinancialExp(int financialExp) {
		this.financialExp = financialExp;
	}
	
   /* public void printmyDetails(){
    	getEmpId();
    }*/	

}
