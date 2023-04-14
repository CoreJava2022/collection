package com.MapProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.collectionList.StudentInfo;

public class GetMultipleValue {
	
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101, "manasi@gmail.com"));
		studentList.add(new Student(101, "Kulkarni@gmail.com"));
		studentList.add(new Student(102, "AmeyKulkarni@gmail.com"));
		
		
		 List<String> email = new ArrayList<>();
		 
    Map<Integer,List<String>> multipleVal = new HashMap<Integer,List<String>>();
		
    Map<Integer,List<String>> finalMap = new HashMap<Integer,List<String>>();
    for(Entry<Integer, List<String>> map : multipleVal.entrySet()) {
    	
    	multipleVal.put(map.getKey(),new ArrayList<>());
    	
			for(Student s : studentList) {
				
				if(map.getKey()==s.getRollNo()) {
					
				List<String> std = multipleVal.get(s.getRollNo());
				
				std.add(s.getName());
					
					finalMap.put(map.getKey(), map.getValue());
				}
				else {
					//multipleVal.put(s.getRollNo(), email);
				}
				
			}
		}
			for(Entry<Integer, List<String>> map1 : finalMap.entrySet()) {
				System.out.println(map1.getKey()+":"+map1.getValue());
		}
	}
}


//for(Student s : studentList) {
//list = new ArrayList<String>();
//list.add(s.getName());
////System.out.println(list);
//
//for(Entry<Integer, List<Student>> me:multipleVal.entrySet()) {
//if(s.getRollNo()==me.getKey()) {
//	int s1=me.getKey();
//System.out.println(s1+":"+multipleVal.get(list));
//}
//}


//public static void main(String[] args) {
//	
//	List<Student> studentList = new ArrayList<Student>();
//	studentList.add(new Student(101, "manasi@gmail.com"));
//	studentList.add(new Student(101, "Kulkarni@gmail.com"));
//	studentList.add(new Student(102, "AmeyKulkarni@gmail.com"));
//	studentList.add(new Student(102, "gmail.com"));
//	studentList.add(new Student(103, "AmeyKulkarni@gmail.com"));
//	
//	 List<String> email = new ArrayList<>();
//	 
//Map<Integer,List<String>> multipleVal = new HashMap<Integer,List<String>>();
//	
//   
////	multipleVal.put(101,new ArrayList<String>());
////	multipleVal.put(102,new ArrayList<String>());
////	multipleVal.put(103,new ArrayList<String>());
//
//multipleVal.put(101,email);
//multipleVal.put(102,email);
//	
//	Map<Integer,List<String>> finalMap = new HashMap<Integer,List<String>>();
//	
//		for(Student s : studentList) {
//			for(Entry<Integer, List<String>> map : multipleVal.entrySet()) {
//				if(map.getKey()==s.getRollNo()) {
//					multipleVal.get(map.getKey()).add(s.getName());
//					finalMap.put(map.getKey(),multipleVal.get(map.getKey()));	
//				}
//				else {
//					finalMap.put(1, map.getValue());
//				}
//			}
//		}	
//		for(Entry<Integer, List<String>> map1 : finalMap.entrySet()) {
//			System.out.println(map1.getKey()+":"+map1.getValue());
//		}
//}