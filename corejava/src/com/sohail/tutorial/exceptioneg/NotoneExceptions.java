package com.sohail.tutorial.exceptioneg;

public class NotoneExceptions extends Exception{
	private String mymessage;
	public NotoneExceptions(String mymessage)
	{
		this.mymessage=mymessage;
	}
	@Override
	public String toString(){
		return "User defined";
	}
}
