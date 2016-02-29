package com.sohail.tutorial.exceptioneg;

import com.sohail.tutorial.inheritance.abstractionExample.VocalClassical;

public class ExceptionExample {

public static void main(String[] args) {
	
VocalClassical bp=new VocalClassical("786","prakash","drum");
System.out.println(bp.getsinger().toUpperCase());
try {
  	
 System.out.println(args[1]);
// System.out.println(bp.getclassicalmusictype().toUpperCase());
}
	
catch (NullPointerException exp) {
	exp.printStackTrace();
		
}
catch(ArrayIndexOutOfBoundsException exp){
	exp.printStackTrace();
	System.out.println("I am in Arrayexception");
}
finally{
System.out.println("Finally...................");}
}	

	private String args;
		public void numberFormatException(String[] arg){
//		System.out.println(bp.getclassicalmusictype());
		int a=0;
		try{
			a=Integer.parseInt(args);
		}
		catch(Exception exp){
			System.err.println("I am in exception block");
			exp.printStackTrace();
			
		}
		int b= 10 +a;
		
		System.out.println(b);
		
		int c=b + getvalue(a);
		System.out.println("Final value =" + c);
		}
	
	public static int getvalue(int a){
		return a+400;
		
	}
	
       
}
