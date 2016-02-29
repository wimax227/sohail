package com.sohail.tutorial.staticexample;

public class Pen {

	public String color;
	public String name;
	public int height;
	
	public static String country;
	
	public Pen(String name){
		System.out.println("I am a constructor");
		this.name=name;
	}
	
	static{
		System.out.println("I am static block");
	}	
	
}
