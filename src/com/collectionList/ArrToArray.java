package com.collectionList;

import java.util.ArrayList;
import java.util.List;

public class ArrToArray {
	
	public int[] convertIntArrToArrayList(String string){
		char[] list=string.toCharArray();
		int[] num = new int[list.length];
		System.out.println("print Array :");
		for (int i = 0; i < list.length; i++) {
			System.out.print(num[i]=list[i]-'0');
		}
	 	return num;	
	}
	public static void main(String[] args) {
		
		ArrToArray array = new ArrToArray();
		int[] intValue = array.convertIntArrToArrayList("12345678786");
		System.out.println();
		System.out.println("Convert array to List");
		List<Object> integerList=new ArrayList<Object>(intValue.length);
		for (Integer integer : intValue) {
			integerList.add(integer);
		}
			System.out.println("size of integerList ="+integerList.size());
			System.out.println("value in list is :"+integerList);
			integerList.clear();
			System.out.println("size of intergerList after clear()= "+integerList.size());
			System.out.println("After clear"+integerList);
			
			integerList.add(1);
			integerList.add("java");
			integerList.add('A');
			integerList.add(10.5);
			
			System.out.println("size of integerList is :"+integerList.size()+"value in list is :"+integerList);
			
			System.out.println("Value getting from integerList : "+integerList.get(1));
			//integerList.remove(2);
			//System.out.println("After remove "+integerList);	
	}
}
