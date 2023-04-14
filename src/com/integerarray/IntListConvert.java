package com.integerarray;

import java.util.ArrayList;
import java.util.List;

public class IntListConvert {
	
	IntArrayConvert intArray; // HAS-A relationship
	List<Integer> integerList;

	// constructor
	public IntListConvert() {
		intArray = new IntArrayConvert();
		intArray.intArry();
	}

	public IntArrayConvert getIntArrayConvert() {
		return intArray;
	}

 public void intList(int[] arr) {
		int[] intarr1 = arr;
		integerList = new ArrayList<Integer>(intarr1.length);
		for (Integer integer : intarr1) {
			integerList.add(integer);
		}
		System.out.println("\nsize of integerList : " + integerList.size());
		System.out.println("value of integerList : " + integerList);
	}
}
