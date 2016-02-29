package com.sohail.tutorial.collections;

import java.util.List;

import com.sohail.tutorial.io.serializable.Person;

import java.util.ArrayList;

public class ArrayExample {

	public static void main(String[] args) {
		
		List list= new ArrayList();
		list.add(78);
		list.add(208);
		list.add(73);
		list.add(782);
		list.add(56);
		list.add(96);
		list.add(78);
		list.add(78);
		list.add(2, 786);
		System.out.println("Size is=" + " " + list.size());
		
		for (int i=0 ; i<list.size() ; i++)
		{
			System.out.println(list.get(i));
		}
		
		list.add(78);
		list.add(new Integer(52));
		list.add("Jayram");
		Person per =new Person("TP","LP",74);
		list.add(per);
		
		
        System.out.println("Size is=" + " " + list.size());
		
		for (int i=0 ; i<list.size() ; i++)
		{
			System.out.println(list.get(i));
//			System.out.println(list);
		}
		
//		Passcollection(list);
		
	}
	public static void Passcollection(List xyz){
		System.out.println(xyz);
	}

}
