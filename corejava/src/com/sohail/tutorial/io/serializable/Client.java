package com.sohail.tutorial.io.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person zaman=null;
		zaman= new Person("zaman","jefferson",1234);	
		
		/*System.out.println(zaman.getAddress()+" "+ zaman.getName()+ zaman.getSsn());
		FileOutputStream fos= new FileOutputStream("c:\\zaman\\zaman.dat");
		ObjectOutputStream oop= new ObjectOutputStream(fos);
		oop.writeObject(zaman);
        oop.close();
        System.out.println("Object written sucessfully");
       */	
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\zaman\\zaman.dat"));
	    Person niha=(Person)ois.readObject();
		System.out.println(niha.getAddress());
		
        
	}

}
