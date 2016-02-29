package com.sohail.tutorial.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoppingExample {
   	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(98);
		list.add(56);
		list.add(23);
		list.add(45);
//		list.add("5");
/*		for(int i=0; i<=list.size(); i++){
			System.out.println(list.get(i));
		}
*/		
		Iterator<Integer> ite= list.iterator();
		int val=0;
		while(ite.hasNext()){
//			System.out.println(ite.next());
//          Integer fte= (Integer)ite.next();
			val=val+ite.next();
			System.out.println(val);
//			if (fte==23){
//			ite.remove();
			
			}
		System.out.println(list);
			
		}
		
	}
