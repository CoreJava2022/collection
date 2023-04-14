package com.collectionList;


import java.util.Iterator;
import java.util.Stack;


public class StackOpe {

	public static void main(String[] args) {
		 Stack<String> s = new Stack<String>();
		 s.push("manasi");
		 s.push("Ruthuja");
		 s.push("Amey");
		 s.push("Bhushan");
		 s.push("Kiran");
		 s.push("Tushar");
	
		 System.out.println(s);
      s.pop();
      System.out.println(s);
      
      System.out.println(s.firstElement());
	}

}
