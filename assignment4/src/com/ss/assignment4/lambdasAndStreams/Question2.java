package com.ss.assignment4.lambdasAndStreams;

import java.util.List;
import java.util.stream.Collectors;

public class Question2 {
	

	public static String encode(List<Integer> nums) {
		
		return nums.stream()
				.map(num -> (num % 2 == 0 ? "e" : "o") + num)
				.collect(Collectors.joining(","));
				
	}
}
