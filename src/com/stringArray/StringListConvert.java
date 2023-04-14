package com.stringArray;

import java.util.Arrays;
import java.util.List;


public class StringListConvert {
	
	StringArrConvert stringArr;
	List<String> stringList;
	List<String> nameList;
	String[] s;
	
	public StringListConvert(){
		stringArr = new StringArrConvert();
	 s=stringArr.stringConvert("manasi,rutuja,tushar,bhushan,kiran");
	}
	
	public StringArrConvert getStringArr() {
		return stringArr;
	}
	
	public void stringList(){
		List<String> nameList = Arrays.asList(s);  

	      for (String e : nameList) {  
	         System.out.println(e);  
	      } 
	      System.out.println("StringList Size is :"+nameList.size());
	      System.out.println("StringList  :"+nameList);
	}
	

}
