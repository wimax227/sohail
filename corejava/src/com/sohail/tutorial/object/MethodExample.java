package com.sohail.tutorial.object;

public class MethodExample {

	public static void main(String[] args) {
		person niha = new person(10,"DJ");
		person humaid = new person(15,"fox",4);
//		niha.setAge(-10);
//		niha.setHeight(6);
//    	niha.setName("aimed");
		
		niha.setAddress("canada");
		niha.setHeight(9);
		
		humaid.setAddress("UK");
System.out.println("Niha's age is" + " " +niha.getAge());
System.out.println("Humaid's age is" + " " +humaid.getAge());

System.out.println("Niha's nick name is" + " "+niha.getName());
System.out.println("Humaid's nick name is" + " "+humaid.getName());

System.out.println(niha.getHeight());
System.out.println(humaid.getHeight());

System.out.println(niha.getAddress());
System.out.println(humaid.getAddress());


	}

}
