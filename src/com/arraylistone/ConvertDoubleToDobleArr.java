package com.arraylistone;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConvertDoubleToDobleArr {
   List<Double> dList;
   
   
   public List<Double> convertDArray(double[] dArray){
	   dList = new ArrayList<Double>();
	   String fileName = "DoubleList.txt";
	   File file = new File(fileName);
	   FileWriter fileWriter= null;
	   try {
		   fileWriter = new FileWriter(file);
		   try {
			   for(double i : dArray){
				   dList.add(i);
				}
			   fileWriter.write(" "+dList);
			   Iterator<Double> itr= dList.iterator();
			   while(itr.hasNext()) {
				   System.out.println(itr.next());
			   }
		} finally {
			fileWriter.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	   
	return dList;  
   }
	public static void main(String[] args) {
//		ConvertDoubleToDobleArr ConvertDoubleArr = new ConvertDoubleToDobleArr();
//        double[] dArray = {1.233D,4.563D,4.0D,56.78D,6.78D,43.56D}; 
//        ConvertDoubleArr.convertDArray(dArray);
	}

}
