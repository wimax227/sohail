package com.sohail.tutorial.inheritance.abstractionExample;

public class SymphonyClassical extends ClassicalMusic {
	
	public SymphonyClassical(String type,String singer,String musicalInstrument){
		super(type,singer,musicalInstrument);
		
	}
	@Override
	public String singingspeed(){
		return "Speed is fast good";
	}
	
	@Override
	public String classicalDuration() {
		
		return "duration is 40 mins";
	}
	
	

}
