package com.arraylistone;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConvertFloatToFlotArr {
		
		List<Float> floatList;
	
		
		public List<Float> convertFloatArr(float[] arr){
			floatList=new ArrayList<Float>();
			String str="FloatList.txt";
			File file=new File(str);
			FileWriter fileWriter=null;
			try {
				fileWriter=new FileWriter(file);
				try {
					for(float i :arr){
						floatList.add(i);
					}
					fileWriter.write(" "+floatList);
					//System.out.println("Float List is "+floatList);
				floatList.forEach(l->System.out.println(l));
				} finally{
					fileWriter.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			return floatList;
		}
		public static void main(String[] args) {
//			ConvertFloatToFlotArr floatArr = new ConvertFloatToFlotArr();
//			float[] floatarray= {1.9f,2.4f,3.5f,4.0f,50.755f};
//	         floatArr.convertFloatArr(floatarray);
		}
	}





