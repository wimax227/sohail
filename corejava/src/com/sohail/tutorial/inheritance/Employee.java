package com.sohail.tutorial.inheritance;

public class Employee {
	private int empId;
	private String name;
	private String empDept;

	
public Employee(int empId,String name, String empDept)
	{
		this.empId=empId;
		this.name=name;
		this.empDept=empDept;
	}	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	

public String 	getTieColor(){
return empDept+" " +"Employee has a blue color tie";
}

/*public void printDetails(){
	System.out.println(getTieColor());
	System.out.println(getEmpDept());
	System.out.println(getEmpId());
	System.out.println(getName());

}*/
}
 	