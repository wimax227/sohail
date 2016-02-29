package com.sohail.tutorial.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderExample {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("c:\\zaman\\temp2.txt"));
			BufferedWriter bw= new BufferedWriter(new FileWriter("c:\\zaman\\temp3.txt"));
			int c;
			while((c=br.read()) != -1){
				bw.write(c);
				
			}
			System.out.println("Data written sucessfully");
			bw.flush();
		} catch (Exception e) {
		e.printStackTrace();	
		}

	}

}
