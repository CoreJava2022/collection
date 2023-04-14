package com.arraylist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StrArrToList {
	
	List<String> nameList;
	public void convertString(File file) {
		String[] strArray = new String[] { "manasi", "Ruthuja", "Mrunal" };
		// printing the string array using Arrays.toString()
		System.out.println(Arrays.toString(strArray));

		 nameList = Arrays.asList(strArray);

		for (String e : nameList) {
			System.out.println(e);
		}
		System.out.println("StringList Size is :" + nameList.size());

		System.out.println("StringList  :" + nameList);
		
		FileWriter writer = null;
		BufferedWriter bWriter = null;
		try {
			file.createNewFile();
			try {
				writer = new FileWriter(file);
				System.out.println("File contains some data");

				for (String inte : nameList) {
					writer.write(" " + inte);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

	public static void main(String[] args) {
		StrArrToList strList = new StrArrToList();
		File file = new File("StringFile.txt");
		strList.convertString( file);
			
		
	}

}
