package com.arraylist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class AddAllList {

	public static void main(String[] args) {
		
		List<Object> arr = new ArrayList<Object>();
		StrArrToList strArrToList = new StrArrToList();
		
		Iterator<Object> obj = arr.iterator();
		while(obj.hasNext()) {
			System.out.println("List :"+obj.next());            
		}
		File file = new File("CombineFile.txt");
		FileWriter writer = null;
		BufferedWriter bWriter = null;
		try {
			file.createNewFile();
			try {
				writer = new FileWriter(file);
				System.out.println("Write  some data in file");
				for (Object inte :arr) {
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
}
