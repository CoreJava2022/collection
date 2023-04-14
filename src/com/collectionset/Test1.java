package com.collectionset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test1 {

	public void listToSortedSet(List<String> str ){
		
		SortedSet<String> srtSet= new TreeSet<String>(str);
		Iterator<String> itr = srtSet.iterator();
		System.out.println("sorted through alphabetically");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
	}
	
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
          str.add("manasi");
          str.add("Ruthuja"); 
          str.add("Tushar");
          str.add("Bhushan");
          str.add("kiran");
          str.add("prashant");
          
          Test1 test1= new Test1();
          test1.listToSortedSet(str);
 }
}
