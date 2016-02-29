package com.sohail.tutorial.io.serializable;

import java.io.Serializable;

public class Person implements Serializable {
	
private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	private int ssn;
	private int id;
//	private int tty;
	
	public Person (String name , String address , int ssn){
     this.name=name;
     this.address=address;
     this.ssn=ssn;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getSsn() {
		return ssn;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	
	

}
