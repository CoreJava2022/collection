package com.collectionset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {

	public List<String> convert(List<String> stringValue){
		
		Set<String> setValue = new HashSet<String>(stringValue);
		System.out.println("Duplicate value removed from Set");
		for(String value :setValue){
			System.out.println("Set value : "+value);
		}
		return stringValue;	
	}
	
	public static void main(String[] args) {
		
		ConvertListToSet convertListToSet = new ConvertListToSet();
		List<String> string = new  ArrayList<String>();
		string.add("A");
		string.add("A");
		string.add("B");
		string.add("C");
		string.add("A");
		string.add("D");
		string.add("E");
		System.out.println("List values are ");
		for(String str : string){
			System.out.println("String List :"+str);
		}
		convertListToSet.convert(string);
	}

}
