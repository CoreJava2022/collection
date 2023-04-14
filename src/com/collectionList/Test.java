package com.collectionList;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("core java");
		list.add("c");
		list.add("c++");
		list.add("HTML");
		list.add("Javascript");
		try{
			for(String string : list) {
				list.remove(string);
			System.out.println(string);	
			}
		}catch(ConcurrentModificationException e){
			e.printStackTrace();
		}
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		
	}

}
