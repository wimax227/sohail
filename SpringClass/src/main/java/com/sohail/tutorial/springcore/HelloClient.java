package com.sohail.tutorial.springcore;

public class HelloClient {

	public static void main(String[] args) {
		HelloWorld hello=new HelloWorldImpl();
		System.out.println(hello.sayHello("zaman"));
		

	}

}
