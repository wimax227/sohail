package com.sohail.tutorial.inheritance.abstractionExample;

public abstract  class ClassicalMusic extends Music {
	
	private String classicalmusictype;
	public ClassicalMusic(String type, String singer, String musicalInstrument){
		super(type,singer,musicalInstrument);
	}
	
	public  ClassicalMusic(String type, String singer, String musicalInstrument,String classicalmusictype){
		super(type,singer,musicalInstrument);
		this.classicalmusictype=classicalmusictype;
	}


	public void setclassicalmusictype(String classicalmusictype){
		this.classicalmusictype=classicalmusictype;
	}
	
	public String getclassicalmusictype(){
		return classicalmusictype;
		
	}
	
	

	public abstract  String classicalDuration();

	
}
