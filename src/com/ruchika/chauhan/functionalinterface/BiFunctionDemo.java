package com.ruchika.chauhan.functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionDemo {
public static void main(String[] args) {
	BiFunction<Integer, Integer, Integer> f=(a,b)->a+b;
	System.out.println(f.apply(20, 10));
}
}
