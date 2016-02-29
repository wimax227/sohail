package com.sohail.tutorial.io;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileExample {

	public static void main(String[] args)  {
		File file=new File("c:\\zaman\\temp1.txt");
		boolean isFileCreated=false;
		System.out.println(file.exists());;
		 if(!file.exists()){
        	try {
				isFileCreated= file.createNewFile();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
        	}
		 System.out.println("Is file created" + isFileCreated);
		 FileWriter fw=null;
		 try {
			fw=new FileWriter(file);
			fw.write("Hey how is it going, this is Zaman here");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 finally{try {
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 
		 FileReader fr=null;
		 char[] data=new char[1000];
		 try {
			fr=new FileReader("C:\\zaman\\temp2.txt");
		    fr.read(data);
		    for(char c : data){
		    	System.out.print(c);
		    }
			}  
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		 finally{
			 if(fr !=null){
				 try {
					fr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			 }
		 }
		 }
		 
	}

}
