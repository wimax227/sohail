package com.sohail.tutorial.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		
		sortStringList();
		sortObjectList();
				

	}
	
	public static void sortObjectList(){
		Elephant eleI= new Elephant("ram", "black","Indian");
		Elephant eleU= new Elephant("Hary", "grey","USA");
		Elephant eleC= new Elephant("yen", "white","China");
		
		List<Elephant> elephants= new ArrayList<Elephant>();
		elephants.add(eleI);
		elephants.add(eleU);
		elephants.add(eleC);
		
		System.out.println(elephants);
		Collections.sort(elephants);
		System.out.println(elephants);
		
	}
public static void sortStringList(){
	List<String> name = new ArrayList<String>();	
	name.add("Arshad");
	name.add("Ravi");
	name.add("Sami");
	Collections.sort(name);
//	System.out.println(name);

	}

}
