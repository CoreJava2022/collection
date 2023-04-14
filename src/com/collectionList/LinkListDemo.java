package com.collectionList;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<String> linkListValue = new LinkedList<String>();
		
		linkListValue.add("Manasi");
		linkListValue.add("Rutuja");
		linkListValue.add("Bhushan");
		linkListValue.add("Kiran");
		linkListValue.add("Tushar");
		
		ListIterator<String> listItr =linkListValue.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		linkListValue.removeFirst();
		System.out.println(linkListValue);
		
		
		LinkedHashSet<Integer> intValue= new LinkedHashSet<Integer>();
		intValue.add(1);
		intValue.add(2);
		intValue.add(3);
		intValue.add(4);
		intValue.add(5);
		
		ListIterator<Integer> listItr1 = intValue.parallelStream().toList().listIterator();
		while(listItr1.hasNext()) {
			System.out.println(listItr1.next());
		}
		
	}

}
