package org.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class streamMethod {
	public static void main(String[] args) {
		
		// filter(Predicate)
		//   boolean value function
		
		// map(function) - each element operation perform
		
		
		List<String> names = List.of("shubham", "subhanshu", "Abhinav");
		List<String> newNames = names.stream().filter(e -> e.startsWith("s")).collect(Collectors.toList());
		System.out.println(newNames);
		
	}
}
