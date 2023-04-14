package com.arraylistone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConvertStringToStrArr {

	String[] strArry;
	List<String> listString;

	public List<String> convertStRArray(String s) {
		strArry = s.split(",");
		for (int i = 0; i < strArry.length; i++) {
			System.out.print(strArry[i] + " ");
		}
		listString = new ArrayList<String>();
		String str = "StringList.txt";
		File file = new File(str);
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
			try {
				for (String s1 : strArry) {
					listString.add(s1);
				}
				fileWriter.write(listString + " ");
			} finally {
				fileWriter.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Size of list is :" + listString.size());
		//System.out.println("list is :" + listString);
		return listString;
	}

	public static void main(String[] args) {

//		String s = "manasi,Rutuja,Bhushan,Tushar,kiran";
//		ConvertStringToStrArr strArr = new ConvertStringToStrArr();
//		strArr.convertStRArray(s);
	}

}
