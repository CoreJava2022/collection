package com.arraylistone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConvertIntToIntArr {
	
	List<Integer> intList;

	public List<Integer> getIntList() {
		return intList;
	}
	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}
	public List<Integer> convertIntArr(int[] arr){
	   intList=new ArrayList<Integer>();
		String str="IntList.txt";
		File file=new File(str);
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter(file);
			try {
				for(int i :arr){
					intList.add(i);	
				}
				fileWriter.write(" "+intList);
				setIntList(intList);
				//System.out.println("Int List is "+intList);
				//intList.forEach(l->System.out.println(l));
			} finally{
				fileWriter.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return intList;
	}
	public static void main(String[] args) {
//		ConvertIntToIntArr intArr = new ConvertIntToIntArr();
//         int[] intarray= {1,2,3,4,5};
//         intArr.convertIntArr(intarray);
	}
}




