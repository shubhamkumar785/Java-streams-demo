package org.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class streamMethod {
	public static void main(String[] args) {
		
		// filter(Predicate)
		//   boolean value function
		
		// map(function) - each element operation perform
		
        // print a name with starting with "s
		List<String> names = List.of("shubham", "subhanshu", "Abhinav");
		List<String> newNames = names.stream().filter(e -> e.startsWith("s")).collect(Collectors.toList());
		System.out.println(newNames);
		
		newNames.stream().forEach(System.out::println);

		
		// traverse a number
		List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9);
		numbers.stream().forEach(e -> {
			System.out.println(e);
		});
		
		
		// print a square of number
		List<Integer> numbers1 = List.of(2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> newNumber2 = numbers1.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(newNumber2);


				
		// to sort a number
		List<Integer> numbers2 = List.of(78, 34, 56, 43, 23, 67);
		numbers2.stream().sorted().forEach(System.out::println);
		
	}
}


