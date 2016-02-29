package com.sohail.tutorial.inheritance.abstractionExample;

public class RockMusic extends Music {
	
	private String bandname;
	public RockMusic(String type, String singer, String musicalInstrument){
		super(type,singer,musicalInstrument);
	}
	
	public RockMusic(String type, String singer, String musicalInstrument,String bandname){
    super(type,singer,musicalInstrument);
    this.bandname=bandname;
	}

	public String getBandname() {
		return bandname;
	}
	public void setBandname(String bandname) {
		this.bandname = bandname;
	}
	
	@Override
	public String singingspeed(){
		return "Singing fast";
	}

}
