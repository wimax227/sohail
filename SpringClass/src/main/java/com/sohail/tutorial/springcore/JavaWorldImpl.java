package com.sohail.tutorial.springcore;

public class JavaWorldImpl implements HelloWorld {

	private String courseFee;
	private String duration;
	private Address address;

	
	@Override
	public String sayHello(String name) {
		return "Hello this really fun, isn't...." +name+ "!!!!!!"+ "\n your course fees is"+ this.getCourseFee()+
				"\n duration of the course is "+ this.duration
				+"\n The address is  "+ address.getCountry() + "" +address.getStreetAdress();
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}
	
	
	}
	


