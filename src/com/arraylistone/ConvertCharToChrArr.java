package com.arraylistone;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ConvertCharToChrArr {
	List<Character> chrList;
public List<Character> convrtChrArr(char[] ch){
	
	chrList=new ArrayList<Character>();
	String fileName = "CharList.txt";
	File file = new File(fileName);
	FileWriter fileWriter=null;
	try {
		fileWriter=new FileWriter(file);
		try {
			for(char i : ch){
				chrList.add(i);
			}
			fileWriter.write(" "+chrList);
			//System.out.println("size of char list is :" + chrList.size());
			//System.out.println("char list is :" + chrList);
		} finally {
			fileWriter.close();
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	return chrList;
}
	public static void main(String[] args) {
//		ConvertCharToChrArr ConvertChrArr = new ConvertCharToChrArr();
//		char[] ch = {'M','A','N','A','S','I'};
//		ConvertChrArr.convrtChrArr(ch);

	}

}
