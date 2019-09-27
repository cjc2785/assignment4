package com.ss.assignment4.lambdasAndStreams;

import java.util.Arrays;
import java.util.Comparator;

public class Question1 {
	
	public static void main(String[] args) {
		
		
		String[] words = {
			"e",
			"apple sauce",
			"four",
			"zzzzzzzz",
			"five5",
			"eee"
		};
		
		Question1.sortByLengthAscending(words);
		System.out.println("length ascending: " + Arrays.toString(words));
		
		Question1.sortByLengthDescending(words);
		System.out.println("length descending: " + Arrays.toString(words));
		
		Question1.sortByFirstChar(words);
		System.out.println("first character: " +  Arrays.toString(words));
		
		Question1.sortByContainsE(words);
		System.out.println("contains E " +  Arrays.toString(words));
	}
	
	static void sortByLengthAscending(String[] x) {
		
		Arrays.sort(x, Comparator.comparingInt(String::length));
	}
	
	static void sortByLengthDescending(String[] x) {
		
		Arrays.sort(x, Comparator.comparingInt(String::length).reversed());
	}
	
	static void sortByFirstChar(String[] x) {
		
		Arrays.sort(x, Utils::comparingFirstChar);
 	}
	
	static void sortByContainsE(String [] x) {
		
		Arrays.sort(x, (a,b) -> Utils.comparingContainsE(a,b));
	}
}

class Utils {
	static int comparingFirstChar(String a, String b) {
		return a.charAt(0) - b.charAt(0);
	}
	
	static int comparingContainsE(String a, String b) {
		return a.contains("e") ? -1 : 1;
	}
}
