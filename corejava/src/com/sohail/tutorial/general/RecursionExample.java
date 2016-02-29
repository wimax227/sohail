package com.sohail.tutorial.general;

public class RecursionExample {

	public static void main(String[] args) {
		RecursionExample re = new RecursionExample();
		System.out.println(re.factorial(10));

	}

	public int factorial(int n){
		
		if (n==1) return 1;
		return n*factorial(n-1);
		
	}
}
