package com.ss.assignment4.lambdasAndStreams;

import java.util.List;
import java.util.stream.Collectors;

public class Question3 {
	
	public static void main(String[] args) {
		
		List<String> words = List.of("back", "bat", "x", "dog", "cat", "wrong", "race", "ca", "");
		
		System.out.println(Question3.startWithaAndHaveExactly3Letters(words));
	}
	
	public static List<String> startWithaAndHaveExactly3Letters(List<String> words) {
		
		return words.stream()
				.filter(word -> word.length() == 3)
				.filter(word -> word.charAt(0) == 'a')
				.collect(Collectors.toList());
	}
}
