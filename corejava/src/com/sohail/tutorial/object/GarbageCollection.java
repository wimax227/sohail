package com.sohail.tutorial.object;

public class GarbageCollection {

	public static void main(String[] args) {
//		person salman= new person(40,"Khan");
//		person arbaz= new person(38,"Khan");
//		person imran= new person(35,"Khan");
//		
//		System.out.println(salman.getAge());
//		System.out.println(arbaz.getName());
//		imran.showDetails();
		
		for (int i=0; i<500000; i++){
			new person(i,"Name"+i);
		}
		System.gc();
		
		
	}

}
