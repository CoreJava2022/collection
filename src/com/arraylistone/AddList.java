package com.arraylistone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddList {
	List<Object> obj1;
	public List<Object> allDataType(List<Integer> i,List<Float>  b,List<Character> c,List<Double> d,List<String> e,File file){
		 obj1 = new ArrayList<Object>();
		FileWriter fileWriter1= null;
		try {
			 fileWriter1 = new FileWriter(file) ;
			try {
		System.out.println("all data type list are as follows:");
		obj1.add(i);
		obj1.add(b);
		obj1.add(c);
		obj1.add(d);
		obj1.add(e);
	
		Iterator<Object> itr=obj1.iterator();
		while(itr.hasNext()) {
			fileWriter1.write(itr.next()+"\n");
		}
			}finally{
				fileWriter1.close();
			}
			
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		return obj1;
	}
	public static void main(String[] args) {
		
		//interger list
		ConvertIntToIntArr convertIntArr = new ConvertIntToIntArr(); 
		 int[] intarray= {1,2,3,4,5};
		 convertIntArr.convertIntArr(intarray);
		List<Integer> a = convertIntArr.getIntList();
		
		//Float List
		ConvertFloatToFlotArr floatArr = new ConvertFloatToFlotArr();
		float[] floatarray= {1.9f,2.4f,3.5f,4.0f,50.755f};
        List<Float>  b= floatArr.convertFloatArr(floatarray);
		
        //Character List
		ConvertCharToChrArr ConvertChrArr = new ConvertCharToChrArr();
		char[] ch = {'M','A','N','A','S','I'};
	    List<Character> c=ConvertChrArr.convrtChrArr(ch);
		
	    //double List
	    ConvertDoubleToDobleArr ConvertDoubleArr = new ConvertDoubleToDobleArr();
        double[] dArray = {1.233D,4.563D,4.0D,56.78D,6.78D,43.56D}; 
       List<Double> d= ConvertDoubleArr.convertDArray(dArray);
	    
       //String List 
       String s = "manasi,Rutuja,Bhushan,Tushar,kiran";
		ConvertStringToStrArr strArr = new ConvertStringToStrArr();
		List<String> e=strArr.convertStRArray(s);
		
		String fileName ="ALLList.txt";
		File file = new File(fileName);
		 AddList  addList = new  AddList();
		 addList.allDataType(a,b,c,d,e,file);
	}

}
