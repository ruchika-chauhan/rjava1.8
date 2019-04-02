package com.ruchika.chauhan.lambdatest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo1 {
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Ruchika");
		l.add("Chauhan");
		l.add("Prashant");
		l.add("Pratap");
		Predicate<String> p1=s->s.charAt(0)=='P';
		for (String string : l) {
			if(p1.test(string)) {
				System.out.println(string);
				
			}
		}
	}

}
