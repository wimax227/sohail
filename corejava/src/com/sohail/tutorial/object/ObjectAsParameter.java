package com.sohail.tutorial.object;

public class ObjectAsParameter {

	public static void main(String[] args) {
		person niha = new person(10,"DJ");
		person humaid = new person(15,"fox",4);
		
		ObjectAsParameter oap= new ObjectAsParameter();
//		System.out.println(niha);
    	System.out.println("Before" + " "+niha.getName());
		oap.objectParamter(niha);
		
		System.out.println("After" + " "+niha.getName());
//		oap.objectParamter(humaid);
		
		int val=50;
		oap.callMeParameter(val);
		System.out.println(val);
	    
		String stn = "Sharukh";
		oap.changeMe(stn);
		System.out.println(stn);
		

		
		
	}

	public void objectParamter(person per) {
//		per.showDetails();
		per.setName("testing");
		
		}
	
	public void callMeParameter(int a){
		a=100;
	}

	public void changeMe(String name){
		name="TestingName";
	}
}
