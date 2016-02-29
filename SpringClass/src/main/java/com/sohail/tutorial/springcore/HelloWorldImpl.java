package com.sohail.tutorial.springcore;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(String name) {
		return "Hello" + name;
	}

}
