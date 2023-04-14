package com.integerarray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class IntFile {
	IntListConvert intListConvert;
	
	public IntListConvert getIntListConvert() {
		return intListConvert;
	}
	
	//constructor
	public IntFile(){
		intListConvert = new IntListConvert();
		int[] intArra=intListConvert.getIntArrayConvert().intarr;
		intListConvert.intList(intArra);
	}
public void convertList(File file , List<Integer> intarra){
	
		FileWriter writer = null;
		
		List<Integer> integerList = null;
		try{
			file.createNewFile();
			try {
				writer = new FileWriter(file);
				System.out.println("List Write into a file "+file);
				for(Integer inte:intarra) {
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
		IntFile intToList = new IntFile();
		File file = new File("IntFile.txt");
		List<Integer> intarra = intToList.getIntListConvert().integerList;
		intToList.convertList(file, intarra);
	}

}
