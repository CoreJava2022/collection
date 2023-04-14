package com.integerarray;

public class IntArrayConvert {
	int[] intarr;

	public void intArry() {
		String s = "123456";
		char[] chr = s.toCharArray();
		intarr = new int[chr.length];
		System.out.println("Integer Array");
		for (int i = 0; i < intarr.length; i++) {
			intarr[i] = chr[i] - '0';
			System.out.print(" "+intarr[i]);
		}
		 
	}
}
