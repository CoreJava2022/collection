package com.collectionList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInList {

	public static void main(String[] args) {
		List<String> maleList = new ArrayList<String>();
		maleList.add("Bhushan");
		maleList.add("Tushar");
		maleList.add("Kiran");
		maleList.add("Piyuash");
		maleList.add("Hitesh");
		maleList.add("Mayur");
		maleList.add("Prashant");

		System.out.println("Size of male list : " + maleList.size());
		
		System.out.println("**********Male List Value***********");
		Iterator<String> it = maleList.iterator();
		System.out.println("Male list is : ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		List<String> femaleList = new ArrayList<String>();
		femaleList.add("Manasi");
		femaleList.add("Ruthuja");
		femaleList.add("Kalyani");
		
		System.out.println("size of female List :"+femaleList.size());
		
		System.out.println("**********Female List Value***********");
		Iterator<String> itt = femaleList.iterator();
		System.out.println("Female list is : ");
		while(itt.hasNext()) {
			System.out.println(itt.next());	
		}
		
		List<String> classList = new ArrayList<String>();
		classList.add("Raja");
		classList.addAll(maleList);
		classList.addAll(femaleList);
		classList.add("Priyanaka");
		
       System.out.println("size of class List :"+classList.size());
		
		System.out.println("**********class List Value***********");
		Iterator<String> cL = classList.iterator();
		 
		while(cL.hasNext()) {
			System.out.println(cL.next());
	                cL.remove();   
		}
		
		 System.out.println("size of class List : "+classList.size());
		 
		 for(String string : classList) {
			 classList.remove(string);
			System.out.println(string);
		 }
 
    
}	
}
