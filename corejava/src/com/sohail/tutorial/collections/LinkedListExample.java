package com.sohail.tutorial.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class LinkedListExample {
public static void main(String[] args) {
////		Set<String> temp1=new HashSet<String>();
//		Set<String> temp1=new TreeSet<String>();
//		temp1.add("z");
//		temp1.add("v");
//		temp1.add("a");
//		temp1.add("g");
//		temp1.add("l");
//		temp1.add("n");
//		temp1.add("g");
//		temp1.add("l");
//		temp1.add("v");	
//		System.out.println(temp1);
		
		List list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("x");
		list.add("b");
		
//		Set<String> uniq= new HashSet<String>();
		
		
		Collections.sort(list);
		
		System.out.println(list);
		
		

	}

}
