package com.sohail.tutorial.object;

public class OverLoading {

	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.cal(2, 3);
		ol.cal(2, 4, 6);
		ol.printDetails("tabu", 55);
		ol.printDetails(55, "tabu");
	}
	
	public void cal(int a , int b){
		System.out.println(a+b);
	}
	
	public void cal(int a , int b , int c){
	System.out.println(a+b+c);}
	
	public void printDetails(String name, int age){
		System.out.println(name +" "+ age);
	}
	
	public void printDetails(int age, String name){
		
		System.out.println(name +" "+ age);
	}
}
