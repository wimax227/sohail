package com.sohail.tutorial.staticexample;

public class StaticExample {
	
	public String instanceVariable="";
	public static String classLevelVariable="";
	
	
	public static void callme(){
		System.out.println(classLevelVariable);
    
		new StaticExample().callNonStatic();
	}
	
	public void callNonStatic(){
		System.out.println(classLevelVariable);
		callNonStatic2("farsi");
	}

	public void callNonStatic2(String name){
		
		callme();
	}
	public static void main(String[] args) {
/*		Pen rotomac = new Pen("rotomac");
		rotomac.height=10;
		rotomac.country="USA";
		System.out.println(rotomac.country);
		
		Pen reynolds = new Pen("reynolds");
		reynolds.height=20;
		reynolds.country="India";
		System.out.println(reynolds.country);
		
//		System.out.println(rotomac.name);
//		System.out.println(reynolds.name);
		
		rotomac.country="USA";
		reynolds.country="India";
		
		Pen.country="mexico";
		
		System.out.println(Pen.country);
		
		String name="zaman";
		System.out.println(StringUtil.toUpperCase(name));*/
		
		
		Pen p1=new Pen("p1");
		Pen p2=new Pen("p2");
		
		
		
		

	}

}
