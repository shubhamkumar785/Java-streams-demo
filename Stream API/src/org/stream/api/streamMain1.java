package org.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamMain1 {
    public static void main(String[] args) {
    	

        List<Integer> list1 = List.of(12, 24, 36, 48, 60);

        
//         Without stream 
        
        List<Integer> listEven = new ArrayList<>();

        for (int num : list1) {
            if (num % 2 == 0) {
                listEven.add(num);
            }
        }

        System.out.println("List1: " + list1);
        System.out.println("Even Numbers: " + listEven);
        
//        with stream
        
        Stream<Integer> streamlist1 = list1.stream();
        List<Integer> newList = streamlist1.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
        
        List<Integer> newList1 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList2 = list1.stream().filter(i -> i> 20).collect(Collectors.toList());
        System.out.println(newList2);
    }
}


