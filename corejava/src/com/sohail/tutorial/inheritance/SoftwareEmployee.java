package com.sohail.tutorial.inheritance;

public class SoftwareEmployee extends Employee{
	private int javaExp;
	
	public SoftwareEmployee(int empId, String name, String empDept) {
	 super(empId,name,empDept);
	 	
	}
	
	public SoftwareEmployee(int empId, String name, String empDept,int javaExp) {
		 super(empId,name,empDept);
         this.javaExp=javaExp;
	}
	
	public void setjavaExp(int javaExp){
		this.javaExp=javaExp;
		
	}
		
	public int getjavaExp(int javaExp){
		return javaExp;
	}
	@Override
	public String 	getTieColor(){
		return super.getEmpDept()+"  "+ "Employee has a white color tie";
		
		}
	
	@Deprecated
	public String 	getTieColor(String color){
		return super.getEmpDept()+"  "+ "Employee has a white color tie";
		
		}
	
	@Override
	public String toString() {
		
		return getEmpDept()+ " " + getEmpId()+ " "+getName();
	}
	
}
