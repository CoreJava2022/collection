package com.collectionList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ListCreate {

	public static void main(String[] args) {
		
		List<StudentInfo> studentList = new ArrayList<StudentInfo>();
		studentList.add(new StudentInfo(101, "manasi"));
		studentList.add(new StudentInfo(102, "rutuja"));
		studentList.add(new StudentInfo(103, "Radhika"));
		studentList.add(new StudentInfo(104, "Tushar"));
		studentList.add(new StudentInfo(105, "Suyog"));
		studentList.add(new StudentInfo(106, "Kiran"));
		List <String> names = new ArrayList<String>();;
		for (StudentInfo str : studentList) {
			names.add(str.getName());	
		}
			if(names.contains("Suyog")||names.contains("Radhika")) {
				System.out.println("Value are present");
			}else {
				Iterator<StudentInfo> itr = studentList.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
			
			
		}
				
					
		
		/*
		 * Map<Integer,String> recordMap = new HashMap<Integer,String>();
		 * 
		 * for(StudentInfo Std : studentList) { recordMap.put(Std.getRollNo(),
		 * Std.getName()); } for(Map.Entry<Integer,String> me:recordMap.entrySet()) {
		 * System.out.print( me.getKey()+":"); System.out.println(me.getValue()); }
		 */

	}
}
