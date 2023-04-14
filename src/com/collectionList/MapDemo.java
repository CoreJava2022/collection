package com.collectionList;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> recordMap = new HashMap<Integer,String>();
		recordMap.put(101, "Manasi");
		recordMap.put(102, "Ruthuja");
		recordMap.put(103, "Bhushan");
		recordMap.put(104, "Tushar");
		recordMap.put(105, "Kiran");
		recordMap.put(106, "Hitesh");
		recordMap.put(107, "pyush");
		
		for(Entry<Integer, String> me:recordMap.entrySet()) {
			System.out.print( me.getKey()+":");
			System.out.println(me.getValue());

		}
		
		Map<Integer,String> mapValue = new TreeMap<Integer,String>();
		
		mapValue.put(1, "Manasi");
		mapValue.put(2, "Rutuja");
		mapValue.put(3, "Tushar");
		mapValue.put(4, "Bhushan");
		mapValue.put(5, "Kiran");
		mapValue.put(6, "Piyush");
		mapValue.put(7, "Hitesh");
		System.out.println("****************************************");
		System.out.println("value of TreeMap as follows");
		
		
		for(Map.Entry<Integer,String> value :mapValue.entrySet()) {
			System.out.print(value.getKey()+":");
			System.out.println(value.getValue());
			
		}
		
	}

}
