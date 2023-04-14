package com.arraylist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CharArrToList {
      
	public void charArray(File file){
		
	char[] chrArray = new char[] {'a','b','c','d','f'};
	
	FileWriter writer = null;
	BufferedWriter bWriter = null;
	try {
		file.createNewFile();
		try {
			writer = new FileWriter(file);
			System.out.println("File contains some data");
			List<Character> charList = new ArrayList<Character>();
		    for (char ch : chrArray) {
		    	charList.add(ch);
		    	writer.write(" " + ch);
		    }
			System.out.println("CharList Size is :" + charList.size());

			System.out.println("CharList   :" + charList);

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
		CharArrToList charArrList = new CharArrToList();
		File file= new File("charFile.txt");
		charArrList.charArray(file);
	}

}
