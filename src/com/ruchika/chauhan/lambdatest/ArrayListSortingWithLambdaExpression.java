package com.ruchika.chauhan.lambdatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortingWithLambdaExpression {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(89);
	l.add(6);
	l.add(20);
	Collections.sort(l);
	System.out.println("Default Sorting ::"+l);
	Collections.sort(l,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
	System.out.println("Custom Sorting ::"+l);


}
}
