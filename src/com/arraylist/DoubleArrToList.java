package com.arraylist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DoubleArrToList {

	public void convertDouble(File file){
		
   double [] doubleArr = {10.9,2.45,3.564,4.98,5.23,6.4};
		
   List<Double> doubleList = new ArrayList<Double>(doubleArr.length);
	for (double i : doubleArr)
	{
		doubleList.add(i);
	}
	System.out.println("converted from intarry to List :"+doubleList);
		
		FileWriter writer = null;
		BufferedWriter bWriter=null;
		try{
			file.createNewFile();
			try {
				writer = new FileWriter(file);
				System.out.println("File contains some data");
				
				for(Double inte:doubleList) {
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
		DoubleArrToList doubleToList = new DoubleArrToList();
		File file = new File("DoubleFile.txt");
		doubleToList.convertDouble(file);
		
	}

}
