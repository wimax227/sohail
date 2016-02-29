package com.sohail.tutorial.object;

public class CompanyClient {
	
public static void main(String[] args) {
		person nayef= new person(8,"zaman");
		
		nayef.setHeight(5);
		nayef.setAddress("mexico");
		
		System.out.println(nayef.getAge());
		System.out.println(nayef.getName());
		System.out.println(nayef.getHeight());
		System.out.println(nayef.getAddress());
		


//CompanyClient cc= new CompanyClient();
//cc.add(2, 3);
//int sum=cc.add(2, 3);
//int finalsum=sum + cc.add(5, 5);
//System.out.println(sum);
//System.out.println(finalsum);
//cc.print("zak");
//		}
//			public int add(int a , int b){
//				return a+b;
//			}
//		
//public void print(String name){
//	System.out.println("your name is" +" "+ name);
		
		OverLoading ol= new OverLoading();
		ol.cal(10, 10);
	}		
	}

