package com.sohail.tutorial.inheritance.abstractionExample;

public abstract class Music {
	private String type;
	private String singer;
	private String musicalInstrument;
	
	public Music(String type, String singer, String musicalInstrument){
		this.type=type;
		this.singer=singer;
		this.musicalInstrument=musicalInstrument;
	}
	
	public void settype(String type){
		this.type=type;
	}
	
	public String gettype(){
		return type;
	}

	public void setsinger(String singer){
		this.singer=singer;
	}
	public String getsinger(){
		return singer;
	}
	
	public void setmusicalInstrument(String musicalInstrument){
		this.musicalInstrument=musicalInstrument;
	}
	
	public String getmusicalInstrument(){
		return musicalInstrument;
	}
	
	public abstract String singingspeed();
}
