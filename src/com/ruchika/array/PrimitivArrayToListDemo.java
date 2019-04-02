package com.ruchika.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimitivArrayToListDemo {
public static void main(String[] args) {
	int[] intArry= {1,3,4,5,5,5,5};
	List<Integer> list=Arrays.stream(intArry).boxed().collect(Collectors.toList());
	System.out.println(list);
	
}
}
