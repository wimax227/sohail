package com.sohail.tutorial.io;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToExistingFile {

	public static void main(String[] args) {
		WriteExistingFile();
		WriteExistingFileWithoutFinally();
	
	
	}
		public static void WriteExistingFile(){
			PrintWriter out=null;
		try{
			/*FileWriter fw=new FileWriter(new File("c:\\zaman\\temp1.txt"),true);
			BufferedWriter bf=new BufferedWriter(fw);*/
			out= new PrintWriter(new BufferedWriter(new FileWriter(new File("c:\\zaman\\temp1.txt"),true)));
			out.println("\n This is modified");
			}
		
		catch (Exception e){
			e.printStackTrace();
		}finally{
			if (out!=null);
			out.close();
		}
		}
	



public static void WriteExistingFileWithoutFinally(){
	
try(PrintWriter out= new PrintWriter(new BufferedWriter(new FileWriter(new File("c:\\zaman\\temp1.txt"),true)));){
		out.println("whatsup man how is it going");
}catch (IOException exp){
exp.printStackTrace();		
}
}
}

