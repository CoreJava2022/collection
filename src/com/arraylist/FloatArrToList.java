package com.arraylist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FloatArrToList {
	
	public void convertFloat(File file){
		
		   float [] floatArr = {11.3f, 2.1f, 3.3f, 4.45f, 5.576f};
				
		   List<Float> floatList = new ArrayList<Float>(floatArr.length);
			for (float i : floatArr)
			{
				floatList.add(i);
			}
			System.out.println("converted from intarry to List :"+floatList);
				
				FileWriter writer = null;
				BufferedWriter bWriter=null;
				try{
					file.createNewFile();
					try {
						writer = new FileWriter(file);
						System.out.println("File contains some data");
						
						for(Float inte:floatList) {
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
				FloatArrToList floatToList = new FloatArrToList();
				File file = new File("FloatFile.txt");
				floatToList.convertFloat(file);
				
			}

}
