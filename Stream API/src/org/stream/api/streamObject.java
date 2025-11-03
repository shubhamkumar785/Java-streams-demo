package org.stream.api;

import java.util.List;
import java.util.stream.Stream;

public class streamObject {
	public static void main(String[] args) {
		
//		1. blank/empty stream
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e -> {
			System.out.print(e);
		});
		
		
		//2. array, object, collection
		String names[] = {"shubham", "subhanhu", "golu", "raj"};
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e -> {
			System.out.println(e);
		});
		
		//3. used builder pattern
		Stream<Object> streamBuilder = Stream.builder().build();
		
		//4. collection - list, set
        List<Integer> list1 = List.of(12, 24, 36, 48, 60);
        Stream<Integer> stream2 = list1.stream();
        stream2.forEach(e -> {
        	System.out.println(e);
        });
        

	}
}
