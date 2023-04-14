package com.arraylist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IntArrToList {
	
	public void convertList(File file){
		
	  int [] intArr = {1,2,3,4,5,6};
	  
	  List<Integer>intList = new ArrayList<Integer>(intArr.length);
		for (int i : intArr)
		{
		    intList.add(i);
		}
		System.out.println("converted from intarry to List :"+intList);
		
		FileWriter writer = null;
		BufferedWriter bWriter=null;
		try{
			file.createNewFile();
			try {
				writer = new FileWriter(file);
				System.out.println("File contains some data");
				
				for(Integer inte:intList) {
					writer.write(" "+inte);
				}
			        }catch (IOException e) {
				e.printStackTrace();
			}finally{
				writer.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
	public static void main(String[] args) {
		IntArrToList intToList = new IntArrToList();
		File file = new File("IntegerFile.txt");
			intToList.convertList(file);
	}
}

