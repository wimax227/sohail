package com.sohail.tutorial.inheritance;



public class PolyNewClient {

	public static void main(String[] args) {
		SoftwareEmployee se = new SoftwareEmployee(963,"shipra","Database")
				{
			@Override
			public String getTieColor() {
			
				return "This is a black tie";
			}
				};
		System.out.println(se.getTieColor());
		
	
		}

}
