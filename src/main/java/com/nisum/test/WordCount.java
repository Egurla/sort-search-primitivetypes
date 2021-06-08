package com.nisum.test;

public class WordCount {
	public static void wordCount(String sentance) {
	char[] len = sentance.toCharArray();
	int a = 0;
	for (char ch : len) {
		a++;
	}
	System.out.println("Length of string is :" + a);
	
}
}
